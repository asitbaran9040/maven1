package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr8 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp");
	WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	from.sendKeys("san");
		Thread.sleep(3000);
		for(int i=0;i<5;i++)
		{
			from.sendKeys(Keys.ARROW_DOWN);
		}
		from.sendKeys(Keys.ARROW_DOWN);
		System.out.println(from.getText());
		
		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		to.sendKeys("las");
			Thread.sleep(3000);
			for(int i=0;i<3;i++)
			{
				to.sendKeys(Keys.ARROW_DOWN);
			}
			to.sendKeys(Keys.ARROW_DOWN);
			System.out.println(to.getText());
			
		 WebElement adult = driver.findElement(By.xpath("//select[@name='adults']"));
		 Select select1=new Select(adult);
		 select1.selectByVisibleText("4");
		 WebElement child = driver.findElement(By.xpath("//select[@name='children']"));
		 Select select2=new Select(child);
		 select2.selectByVisibleText("3");
		 
	}

}
