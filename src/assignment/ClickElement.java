package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class ClickElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(4000);



driver.findElement(By.id("loginButton")).click();
Thread.sleep(8000);
driver.findElement(By.id("logoutLink")).click();
Thread.sleep(4000);
driver.close();
		// TODO Auto-generated method stub

	}

}
