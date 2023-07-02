package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/#!");
		WebElement enter = driver.findElement(By.xpath("//textarea[@id='sb_form_q']"));
		enter.sendKeys("iphone");
		//Actions action=new Actions(driver);
		//action.moveToElement(enter).click().build().perform();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equalsIgnoreCase("iphone 14"))
			{
				options.get(i).click();
				break;
			}
				
				}

	}

}
