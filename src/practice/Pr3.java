package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pr3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/?guccounter=1");
	 WebElement searchbar = driver.findElement(By.xpath("//input[@id='ybar-sbq']"));
	 searchbar.sendKeys("lamborghini");
	 Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
	for(int i=0;i<options.size();i++)
	{
		if(options.get(i).getText().equalsIgnoreCase("lamborghini huracan"))
		{
			
			options.get(i).click();
			break;
		}

			
			}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[@id='ysch']")).click();
	Thread.sleep(2000);
	File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src3,new File("./screenshots/lamb.png"));
		}

	}


