package practice;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class pr2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=489a197e4b291a1cdd847d37713800f4&utm_term=%2Bmyntra&utm_content=Myntra_Generic");
		driver.findElement(By.xpath("//a[@data-group='men']")).click();
		Actions actions=new Actions(driver);
	
	
		
	Thread.sleep(6000);
driver.findElement(By.xpath("//h4[contains(text(),'Biggest Deals On Top Brands')]/../../..//img[contains(@src,'https://assets.myntassets.com/w_245,c_limit,fl_progressive,dpr_2.0/assets/images/2020/8/31/cec595c6-c7ec-4259-af8b-997a33a09ce71598892377444-Puma.jpg')]")).click();
		driver.findElement(By.xpath("//div[@class='categories-more']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='vertical-filters-filters categories-container']"));
for(int i=0;i<options.size();i++)
{
	String l = options.get(i).getText();
	System.out.println(l);
	options.get(i).click();
}
	}

}//
//(//img[@class='image-image undefined image-hand'])[6]