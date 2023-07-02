package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMOactitimeLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");




driver.findElement(By.id("loginButton")).click();


driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();

driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();

driver.findElement(By.id("ext-comp-1002")).click();
driver.findElement(By.xpath("//input[@onchange='nameChanged(this);']")).sendKeys("asitV");
driver.findElement(By.xpath("//input[contains(@value,' Create Type of Work')]")).click();

driver.findElement(By.xpath("//a[contains(text(),'asit')]/../..//a[contains(text(),'delete')]")).click();
Alert alert=driver.switchTo().alert();
alert.accept();
driver.close();
	}

}
