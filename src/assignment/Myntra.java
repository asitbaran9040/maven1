package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=dms_google_pmax_cpc_Myntra_PMax_SOK_KPI_Traffic&keyword=&matchtype=&target=&placement=&gclid=CjwKCAjw586hBhBrEiwAQYEnHajTv0vQVLhIfNgMlWRqVbiA04BonJkDv1fDvZ"
				+ "CWQAd7FyXg_OAD6BoCp2oQAvD_BwE");
	String dr = driver.getTitle();

	driver.findElement(By.xpath("//a[text()='Men']")).click();
	driver.findElement(By.xpath("//a[text()='Women']")).click();
	System.out.println(dr);
	driver.close();
		// TODO Auto-generated method stub

	}

}
