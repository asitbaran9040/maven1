package spider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWbDriverwait {

	public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		driver.findElement(By.linkText("Gmail")).click();*/
		// TODO Auto-generated method stub
WebElement gmailbotton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
gmailbotton.click();
	}

}
