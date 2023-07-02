package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhi {

	public static void main(String[] args) {
		System.setProperty("webdriver.cjhrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		System.out.println(driver.findElement(By.xpath("//label[text()='Keep me logged in']")).getText());
		
		
		// TODO Auto-generated method stub

	}
	//input[@name='username']
}
