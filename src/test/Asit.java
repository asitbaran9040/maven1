package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//input[contains(@class,'gsc-input')]")).sendKeys("asit");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window"));
		driver.findElement(By.linkText("Blogger"));
Set<String> allwindow = driver.getWindowHandles();
Iterator<String> itr= allwindow . iterator();
while(itr.hasNext())
{
	String win=itr.next();
	driver.switchTo().window(win);
}
if(driver.getTitle().equalsIgnoreCase("basic web page title"))
{
	String paraText = driver.findElement(By.id("para2")).getText();
	System.out.println(paraText);
}
Iterator<String> itr1 = allwindow.iterator();
if(driver.getTitle().equalsIgnoreCase("Blogger.com - Create a unique and beautiful blog easily. "))
{
	driver.findElement(By.linkText("Sign in")).click();
}
driver.close();
	}

}
