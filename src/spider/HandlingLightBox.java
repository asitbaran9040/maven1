package spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingLightBox {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hp");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		driver.findElement(By.xpath("//img[@title='HP LP3065']")).click();
		driver.findElement(By.xpath("(//img[@title='HP LP3065'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Close (Esc)']")).click();

	}

}
