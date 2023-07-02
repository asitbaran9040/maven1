package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	WebElement button = driver.findElement(By.xpath("//a[text()='iPhone']"));
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//String title = jse.executeScript("return document.URL").toString();
	
	//System.out.println(title);
	//driver.quit();
	
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//String title = jse.executeScript("return document.title").toString();
	
	//System.out.println(title);
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	WebElement ele = driver.findElement(By.xpath("//a[text()='iPhone']"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)",button);
	typescript(driver,search,"hp");
	}
	
	public static void typescript(WebDriver driver,WebElement element,String text)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+text+"'",element);
		jse.executeScript("history.go(0)");
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

	}
	

	


