package classselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pr1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=489a197e4b291a1cdd847d37713800f4&utm_term=%2Bmyntra&utm_content=Myntra_Generic");
		List<WebElement> links = driver.findElements(By.xpath(("//a")));
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());
		}
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getAttribute("href"));
		}
		

	}

}
