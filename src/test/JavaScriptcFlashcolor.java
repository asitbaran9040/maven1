package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptcFlashcolor {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	WebElement button = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	String defaultColor = button.getCssValue("background-color");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].style.border='3Px  solid pink'",button);
	Thread.sleep(2000);
	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./screenshots/hightlighted.png"));
	jse.executeScript("arguments[0].style.border=''",button);
	
		
	
		

	}

}
