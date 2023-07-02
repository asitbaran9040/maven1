package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("asitbaran");
		driver.findElement(By.xpath("//input[contains(@type,'passw')]")).sendKeys("lululu");
		driver.close();

	}

}
