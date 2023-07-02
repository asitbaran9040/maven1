package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
WebElement username = driver.findElement(By.name("pwd"));
username.sendKeys("manager");
username.sendKeys(Keys.ARROW_DOWN);
username.sendKeys(Keys.ARROW_RIGHT);
username.sendKeys(Keys.ENTER);
String l = driver.getCurrentUrl();
System.out.println(l);
Thread.sleep(2000);
driver.close();
}}
