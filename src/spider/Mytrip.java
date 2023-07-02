package spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mytrip {

	public static void main(String[] args) throws InterruptedException {ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.easemytrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=788997081&utm_content=39319940377&utm_term=easemytrip&utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fKBo"
			+ "-4BfmLQxtaxMAnFXBWXpmTJtN-WgXk3q0c1HCBRdvDHJT0PR6IaAqqvEALw_wcB");
		// TODO Auto-generated method stub
driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='ddate']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[text()='Apr 2023']/../.././/li[text()='19']")).click();
Thread.sleep(4000);
driver.close();
	}

}
