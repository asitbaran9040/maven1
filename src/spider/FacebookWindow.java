package spider;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(4000);
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
		Iterator<String> itr = win.iterator();
		String parent = itr.next();
		System.out.println(parent);
		String child =  itr.next();
		System.out.println(child);
		driver.switchTo().window(child);	
		/*driver.findElement(By.xpath("//input[@fdprocessedid='7nus36']")).sendKeys("asit");
		driver.findElement(By.xpath("//input[@fdprocessedid='jckpdg']")).sendKeys("mahapatro");*/
	
			
		driver.switchTo().window(parent);
		String lo = driver.getTitle();
			System.out.println(lo);
			
			driver.quit();
	}

}
