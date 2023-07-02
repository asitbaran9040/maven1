package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter name')]")).sendKeys("Asit");
		driver.findElement(By.name("lname")).sendKeys("mahapatro");
		WebElement childframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
driver.switchTo().frame(childframe);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashitbaranmahapatro@gmail.com");
driver.switchTo().defaultContent();
String text = driver.findElement(By.xpath("//li[.='Target Locator']")).getText();
System.out.println(text);
driver.close();
	}

}
