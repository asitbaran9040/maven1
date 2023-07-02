package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr15 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.americanairlines.in/intl/in/index.jsp");
		WebElement date = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
		date.clear();
		date.sendKeys("04/05/2024");

	}

}
