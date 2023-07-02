package spider;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Reuseablewindowhandles {
	static WebDriver driver=null;
	static Set<String> allwindows;

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("asit baran will success");
		
	String parentwindow = driver.getWindowHandle();
	driver.findElement(By.linkText("Open a popup window")).click();
	driver.findElement(By.xpath("//a[text()='Blogger']")).click();
	allwindows = driver.getWindowHandles();
	SwitchToRequireWindow("Basic Web Page Title");
    String paratext = driver.findElement(By.id("para1")).getText();
  
	System.out.println(paratext);
	
	SwitchToRequireWindow("Blogger.com - Create a unique and beautiful blog easily.");
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	

	
	driver.switchTo().window(parentwindow);
	
	driver.findElement(By.xpath("//input[@title='search']")).sendKeys("hello");
	
	
	
		

	}
	public static void SwitchToRequireWindow(String Title) 
	{
		Iterator<String> itr = allwindows.iterator();
		while(itr.hasNext())
		{
			String win = itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals(Title))
			{
				
				
				break;
			}
		}
	}

}