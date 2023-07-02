package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActoinDragandDropdown {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		WebElement slide = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(slide, -50, 0).perform();
	}

}
