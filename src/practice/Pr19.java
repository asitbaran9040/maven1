package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr19 {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement tx = driver.findElement(By.id("ta1"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='i am asit baran.'", tx);
	WebElement login = driver.findElement(By.xpath("//form[@name='form1']"));
	js.executeScript("arguments[0].scrollIntoView(true)",login);
	
	System.out.println(js.executeScript("return document.url"));
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-1000)");
	
	
	
	}

}
