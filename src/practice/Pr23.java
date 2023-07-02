package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr23 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
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
Thread.sleep(2000);
WebElement errormsg = driver.findElement(By.xpath("//div[@class='errormsg']"));
String msg=errormsg.getText();
if(msg.contains("Point your mouse cursor to a highlighted field to see the error description."))
	
{
	System.out.println("error msg is matching");
}
else
{
	System.out.println("error msg is not matching");
}
driver.close();

	}

}
