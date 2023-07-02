package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeysPause {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("asit");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("baran").sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		.sendKeys("ashitbaranmahapatro@gmail.com").sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).
		sendKeys(Keys.TAB).sendKeys(Keys.TAB).
		sendKeys(Keys.TAB).
		sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
		

	}

}
//