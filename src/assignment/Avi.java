package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avi {
	public static void main(String[]args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ashit\\OneDrive\\Desktop\\selenium\\saleniumproject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ta1")).sendKeys("Asit have get succided");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.='SeleniumTutorial']")).click();
		Set<String> all = driver.getWindowHandles();
		Iterator<String>itr=all.iterator();
		while(itr.hasNext())
		{
		String win = itr.next();
		driver.switchTo().window(win);
		if(driver.getTitle().equals("Selenium143"))
		{
			String print = driver.findElement(By.xpath("//a[.='What is Selenium?']")).getText();
			System.out.println(print);
			break;
		}
		}
		Iterator<String>itr1=all.iterator();
		while(itr1.hasNext())
		{
			String win=itr1.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals("omayo (QAFox.com)"));
			{
				
				driver.findElement(By.id("ta1")).sendKeys("fuck you a**hole");
				break;
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).getText());
		
		
		
		
	}

}
