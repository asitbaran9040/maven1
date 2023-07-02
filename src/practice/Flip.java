package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement cross = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	 Actions action=new Actions(driver);
		Thread.sleep(2000);
action.moveToElement(cross).click().perform();
WebElement grocery = driver.findElement(By.xpath("(//img[@class='_396cs4']/../../..//div[@class='_1psGvi SLyWEo'])[3]"));
action.moveToElement(grocery).perform();
Thread.sleep(6000);
	}

}
