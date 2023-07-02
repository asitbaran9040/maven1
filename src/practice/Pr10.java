package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr10 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	WebElement but = driver.findElement(By.id("prompt"));
	JavascriptExecutor jse=((JavascriptExecutor)driver);
	jse.executeScript("arguments[0].scrollIntoView(true)", but);
	Actions action =new Actions(driver);
	action.moveToElement(but).click().perform();
	
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("asitbaran");
	alert.accept();
	
	WebElement but2 = driver.findElement(By.id("testdoubleclick"));
	action.doubleClick(but2).perform();
	WebElement link = driver.findElement(By.linkText("compendiumdev"));
action.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform(); 
	
	}

}
