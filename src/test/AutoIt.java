package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIt {

	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions action=new Actions(driver);
		driver.findElement(By.id("uploadfile")).sendKeys("C://Users//ashit//OneDrive//Desktop//autoIt.exe");
		//action.moveToElement(upload).sendKeys("C://Users//ashit//OneDrive//Desktop//autoIt.exe").perform();
	
		// TODO Auto-generated method stub

	}

}
