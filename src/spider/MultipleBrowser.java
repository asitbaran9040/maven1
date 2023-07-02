package spider;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String browser=sc.next();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
			driver=new ChromeDriver(opt);
			driver.get("https://www.primevideo.com/region/eu/detail/0GA4KXLX0F3PU4TVAGJ3TEFRAS/ref=atv_hm_hom_1_c_cjm7wb_2_1");
			Thread.sleep(4000);
			driver.close();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			driver.close();
		}
		else 
		{
			System.setProperty("webdriver.msegde.driver","C:\\Users\\ashit\\OneDrive\\Desktop\\selenium\\saleniumproject\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.w3schools.com/sql/sql_exercises.asp");
			Thread.sleep(4000);
			driver.close();
		
		// TODO Auto-generated method stub

	}

	}}
