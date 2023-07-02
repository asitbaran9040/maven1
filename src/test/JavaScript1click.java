package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1click {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement button = driver.findElement(By.id("alert1"));
	 javaScriptClick(driver,button);
	}
	public static void javaScriptClick(WebDriver driver,WebElement Element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",Element);
	}

	}


