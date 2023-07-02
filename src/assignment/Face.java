package assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Face {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asit");
	    Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name^='reg']")).sendKeys("9040639489");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("asit4003");
		
	
		driver.close();

	}

}
