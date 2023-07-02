package spider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
	org.openqa.selenium.Alert alert=driver.switchTo().alert();
      String textalert = alert.getText();
      System.out.println(textalert);
      alert.accept();
      driver.findElement(By.id("ta1")).sendKeys("hello ");
      Thread.sleep(2000);
      driver.quit();
	
		// TODO Auto-generated method stub

	}

}
