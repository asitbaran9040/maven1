package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
Actions action=new Actions(driver);
action.moveToElement(blogsmenu).perform();
WebElement option1 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
action.moveToElement(option1).click().build().perform();
	}

}
