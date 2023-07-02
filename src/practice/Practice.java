package practice;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {



	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		int noofframes=frames.size();
		int s=0;
		int index=0;
		for(int i=0;i<noofframes;i++)
		{
			driver.switchTo().frame(i);
			s=driver.findElements(By.linkText("Description")).size();
			
			if(s>0)
			{
				index=i;
				driver.switchTo().parentFrame();
				break;
			}
			driver.switchTo().parentFrame();
		}
			driver.switchTo().frame(index);
			driver.findElement(By.linkText("Description")).click();
			
		}
	
		
		
		
	
		
		
}

	
	
		
		
	

	

		
	
		
	
	
	
	

		
		


	


