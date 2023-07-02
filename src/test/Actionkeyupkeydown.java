package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionkeyupkeydown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	WebElement compendiumdevlink = driver.findElement(By.linkText("compendiumdev"));
	Actions actions=new Actions(driver);
	actions.keyDown(Keys.CONTROL).moveToElement(compendiumdevlink).click()
	.keyUp(Keys.CONTROL).build().perform();
		// TODO Auto-generated method stub

	}

}
