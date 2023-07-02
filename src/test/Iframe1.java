package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		
	WebElement iframeWebElement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
     driver.switchTo().frame(iframeWebElement);
     driver.findElement(By.linkText("Home")).click();

	}

}
