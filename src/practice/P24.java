package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.findElement(By.xpath("//span[.='My Account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Register']")).click();
	
	

	}

}
//driver.findElement(By.xpath(null));