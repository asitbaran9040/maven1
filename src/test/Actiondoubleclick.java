package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondoubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement doubleclickOptions = driver.findElement(By.id("testdoubleclick"));
Actions actions=new Actions(driver);
actions.doubleClick(doubleclickOptions).perform();
		// TODO Auto-generated method stub

	}

}
