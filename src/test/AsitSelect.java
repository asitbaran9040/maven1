package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AsitSelect {
 public static void main(String[]args)
 {
	 System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		select.selectByVisibleText("Volvo");
		select.selectByValue("Hyundaix");
		List<WebElement> option = select.getAllSelectedOptions();
		for(int i=0;i<option.size();i++)
		{
			
		System.out.println(option.get(i).getText());
		
		}
	WebElement first = select.getFirstSelectedOption();
	System.out.println(first.getText());
	driver.findElement(By.xpath("//input[@value='GetPrompt']")).click();
	Actions action=new Actions(driver);
   // action.moveToElement(fname).click();
    
	
 }
}
