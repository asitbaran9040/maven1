
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowser {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.msegde.driver","'./drivers/msedgedriver.exe");
		
	}
	public static void chromedriver() throws InterruptedException
	{
		 driver=new ChromeDriver();
		 
			driver.get("https://www.facebook.com/login/");
			
			driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asit");
		    
			driver.findElement(By.cssSelector("input[name^='reg']")).sendKeys("9040639489");
			
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("asit4003");
			
		
			
			
			
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath ("//input[contains(@name,'username')]")).sendKeys("hello");
			
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("hello123");
			
			driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
			
			
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.close();
	}
	public static void msEdge() throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asit");
	    
		driver.findElement(By.cssSelector("input[name^='reg']")).sendKeys("9040639489");
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("asit4003");
		
	
		
		
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath ("//input[contains(@name,'username')]")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("hello123");
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
	}
	public static void firefox() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asit");
	    
		driver.findElement(By.cssSelector("input[name^='reg']")).sendKeys("9040639489");
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("asit4003");
		
	
		
		
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath ("//input[contains(@name,'username')]")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("hello123");
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
	}
	public static void main(String[]args) throws InterruptedException
	{
		Multiplebrowser.chromedriver();
		Multiplebrowser.msEdge();
		Multiplebrowser.firefox();
		
		
	}

}
