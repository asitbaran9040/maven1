package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/?cid=Search|Google|Indigo_brand_new|GoIndigo|Responsive&s_kwcid=AL!12293!3!657470769833!b!!g!!go%20indigo&gclid=EAIaIQobChMI1uyN5cnl_gIVDnkrCh2OpAk5EAAYASAAEgLC7vD_BwE");
		driver.findElement(By.xpath("(//i[@class='icon-tick'])[2]/../..//i[@class='icon-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='GoIndiGo bot icon']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ymIframe");
		driver.findElement(By.xpath("//input[@placeholder='Type your message']")).sendKeys("hello");
		driver.findElement(By.xpath("//i[@id='sendIcon']")).click();
		Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("(//div[@aria-live='assertive'])[4]")).getText());
		
	}

}
