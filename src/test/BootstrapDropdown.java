package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropdown {
static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver(opt);
	driver.get("https://www.hdfcbank.com/");
	Thread.sleep(2000);
	By productTypedropdown=By.xpath("//div[@class='drp1']");
	By productsdropdown=By.xpath("//div[@class='drp2']");
	selectOptionBootstarpDropDownField(productTypedropdown,"Accounts");
	selectOptionBootstarpDropDownField(productsdropdown,"Savings Accounts");
	}
	public static WebElement getWebElement(By field) {
		return driver.findElement(field);
		// TODO Auto-generated method stub

	}public static void selectOptionBootstarpDropDownField(By field,String optionValue)
	{
		getWebElement(field).click();
		String xpath="//li[text()=\'"+optionValue+"\']";
		getWebElement(By.xpath(xpath)).click();
	}

}
