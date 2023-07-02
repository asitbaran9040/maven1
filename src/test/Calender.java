package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Calender {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
	while(!	driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("December"))
	{
		driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
	}
	List<WebElement> day = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		for(int i=0;i<day.size();i++)
		{ 
			if(day.get(i).getText().equalsIgnoreCase("10"))
			{
				day.get(i).click();
				break;
			}
		
			}
		}

	



}

