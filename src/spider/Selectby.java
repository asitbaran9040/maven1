package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectby {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("doc 3 "); 
		select.selectByIndex(2);
		select.selectByValue("ghi");
	System.out.println	(select.isMultiple());
	List<WebElement> options = select.getOptions();
	for(WebElement option:options)
	{
		System.out.println	(option.getText());
	}
	}

}
