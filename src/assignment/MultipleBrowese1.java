package assignment;

import org.openqa.selenium.WebDriver;

public class MultipleBrowese1 {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.msegde.driver","'./drivers/msedgedriver.exe");
		
	}

}
