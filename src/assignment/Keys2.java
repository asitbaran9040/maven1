package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(4000);
driver.findElement(By.name("username")).sendKeys("Admin");
WebElement username = driver.findElement(By.name("password"));
username.sendKeys("admin123");

username.sendKeys(Keys.ENTER);
String l = driver.getCurrentUrl();
System.out.println(l);
Thread.sleep(2000);
driver.close();

	}

}
