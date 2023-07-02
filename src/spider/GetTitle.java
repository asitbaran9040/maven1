package spider;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashit\\OneDrive\\Desktop\\selenium\\saleniumproject\\drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		
		Thread.sleep(4000);
		Set<String> title = driver.getWindowHandles();
		System.out.println(title);
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
