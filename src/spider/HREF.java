package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HREF {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement e:links)
		{if(("href")!=null)
			System.out.println(e.getAttribute("Href"));
		}
		driver.quit();
			}
		
		// TODO Auto-generated method stub

	}


