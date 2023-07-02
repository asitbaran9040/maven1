package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Html {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ashit/OneDrive/Desktop/selenium/saleniumproject/src/test/HTML.html");
		driver.findElement(By.xpath("/html//body//div[4]//input[3]/../..//div[3]//input[2]")).sendKeys("sunny");
		driver.findElement(By.xpath("/html//body//div[3]//input[3]/../..//div[2]//input[2]")).sendKeys("puspa");
		driver.findElement(By.xpath("/html//body//div[1]//input[3]/../..//div[1]//input[1]")).sendKeys("spider");

	}

}
