package spider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=	new FirefoxDriver();
		// TODO Auto-generated method stub
      driver.get("http://omayo.blogspot.com/");
      driver.quit();
	}

}
