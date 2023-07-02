package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys3 {

	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(4000);
	WebElement username = driver.findElement(By.xpath ("//input[@id='email']"));
	 username.sendKeys("qspider");
	 Thread.sleep(2000);
	 username.sendKeys(Keys.BACK_SPACE);
	 
	 for(int i=1;i<=3;i++)
	 {
		 username.sendKeys(Keys.ARROW_LEFT);
	 }
	 Thread.sleep(3000);
	 username.sendKeys(Keys.BACK_SPACE);
	 Thread.sleep(4000);
	 username.sendKeys(Keys.CONTROL,"A");
	 username.sendKeys(Keys.DELETE);
	
	 username.sendKeys("pyspider");
	 Thread.sleep(2000);
	 username.sendKeys(Keys.BACK_SPACE);
	 
	 for(int i=1;i<=3;i++)
	 {
		 username.sendKeys(Keys.ARROW_LEFT);
	 }
	 Thread.sleep(3000);
	 username.sendKeys(Keys.BACK_SPACE);
	 Thread.sleep(4000);
	 username.sendKeys(Keys.CONTROL,"A");
	 username.sendKeys(Keys.DELETE);
	 
	 username.sendKeys("jspider");
	 Thread.sleep(2000);
	 username.sendKeys(Keys.BACK_SPACE);
	 
	 for(int i=1;i<=3;i++)
	 {
		 username.sendKeys(Keys.ARROW_LEFT);
	 }
	 Thread.sleep(3000);
	 username.sendKeys(Keys.BACK_SPACE);
	 Thread.sleep(4000);
	 username.sendKeys(Keys.CONTROL,"A");
	 username.sendKeys(Keys.DELETE);
	 Thread.sleep(4000);
	 driver.close();

	}

}
