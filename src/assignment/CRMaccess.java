package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMaccess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://crmaccess.vtiger.com/login/");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("asit");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("asit123");
		Thread.sleep(2000);
		driver.quit();

	}

}
