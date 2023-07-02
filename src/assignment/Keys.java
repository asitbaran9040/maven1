package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://demo.actitime.com/login.do");
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("asitBaranmahapatro");
username.sendKeys(org.openqa.selenium.Keys.CONTROL,"A");
username.sendKeys(org.openqa.selenium.Keys.CONTROL,"c");
WebElement l = driver.findElement(By.name("pwd"));
l.sendKeys(org.openqa.selenium.Keys.CONTROL,"v");


	}

}
