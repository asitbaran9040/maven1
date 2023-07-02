package spider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebpushNotification {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		

	}

}
