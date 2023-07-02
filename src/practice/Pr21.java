package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	WebElement errormsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
	String msg=errormsg.getText();
	if(msg.equals("Username or Password is invalid. Please try again."))
		
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
