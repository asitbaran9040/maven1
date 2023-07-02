package spider;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("asit baran will success");
		Thread.sleep(3000);
	String parentwindow = driver.getWindowHandle();
	driver.findElement(By.linkText("Open a popup window")).click();
	driver.findElement(By.xpath("//a[text()='Blogger']")).click();
	Set<String> allwindows = driver.getWindowHandles();
	Iterator<String> itr = allwindows.iterator();
	while(itr.hasNext())
	{
		String win = itr.next();
		driver.switchTo().window(win);
		if(driver.getTitle().equals("Basic Web Page Title"))
		{
			String paratext = driver.findElement(By.id("para1")).getText();
			System.out.println(paratext);
			
			break;
		}
	}
	Iterator<String> itr1 = allwindows.iterator();
	while(itr1.hasNext())
	{
		String win=itr1.next();
		driver.switchTo().window(win);
		if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily."))
		{
			driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			
			break;
		}
	}
	driver.switchTo().window(parentwindow);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@title='search']")).sendKeys("hello");
	Thread.sleep(3000);
	driver.quit();
		// TODO Auto-generated method stub

	}

}
