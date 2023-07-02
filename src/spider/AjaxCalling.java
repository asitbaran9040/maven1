package spider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxCalling {

	public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://verifalia.com/validate-email");
		driver.findElement(By.name("inputData")).sendKeys("asit");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement validate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Validate']")));
		validate.click();
		// TODO Auto-generated method stub

	}

}
