package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcreate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
