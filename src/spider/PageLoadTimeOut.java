package spider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadTimeOut {

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		 driver. manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("hey asit here");
		
		
driver.close();

	}

}
