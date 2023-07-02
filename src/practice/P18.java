package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class P18 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshersworld.com/");
 WebElement click = driver.findElement(By.xpath("//span[contains(@id,'resumeuploadid3_reg')]"));
 

 // WebElement click = driver.findElement(By.xpath("//input[@id='file-upload']"));
//Actions action=new Actions(driver);
//action.click(click).perform();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments [0].click()", click);
		// TODO Auto-generated method stub

	}

}
