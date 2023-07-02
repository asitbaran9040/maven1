package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Pr6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement text = driver.findElement(By.xpath("//input[@id='searchInput']"));
		 text.sendKeys("india");
		 Thread.sleep(2000);
		List<WebElement> op = driver.findElements(By.xpath("//em[@class='suggestion-highlight']/.."));
		System.out.println(op.size());
	
	for(int i =0;i<op.size();i++)
	{
		System.out.println(op.get(i).getText());
		
	}
	for(int i=0;i<op.size();i++)
	{
		if(op.get(i).getText().equalsIgnoreCase("indian national congress"))
		{
			op.get(i).click();
		}
	}
	/*	for(int i=0;i<2;i++)
		{
			text.sendKeys(Keys.ARROW_DOWN);
		}*/

		
	}

}
