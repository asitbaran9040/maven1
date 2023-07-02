package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr14 {
	public static void main(String[]args) throws InterruptedException
	{
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("start-maximized");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
	
	driver.get("https://www.britishairways.com/travel/home/public/en_gb/en-in/");
	Thread.sleep(5000);
	driver.findElement(By.id("ensCloseBanner")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.='Outbound']")).click();
	Thread.sleep(1000);
	WebElement monthyear = driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']"));
	String month_year = monthyear.getText();
	while(!(month_year.equals("January 2024")))
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		WebElement newmonthyear = driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']"));
		month_year=newmonthyear.getText();
		
	}
	driver.findElement(By.xpath("//span[.='15']")).click();
	}

}
