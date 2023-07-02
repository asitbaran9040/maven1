package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement type = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
		js.executeScript("arguments[0].value='09/09/2023'",type);
		//js.executeScript("history.go(0)");
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].setAttribute('style','background:black')", type);
	}

}
