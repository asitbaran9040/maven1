package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spider1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
driver.get("https://qspiders.com/");
String url = driver.getCurrentUrl();
System.out.println(url);
driver.findElement(By.xpath("//span[text()='Contact']")).click();
Thread.sleep(2000);
String url1 = driver.getCurrentUrl();
System.out.println(url1);
WebElement getnumb = driver.findElement(By.xpath("//p[contains(text(),'Bhubaneswar')]/../..//span[contains(text(),'+918093')]"));
System.out.println(getnumb.getText());
driver.close();
	}

}
//https://qspiders.com/
