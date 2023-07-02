package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectionbox {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
			WebElement multiSelectionBox = driver.findElement(By.id("multiselect1"));
			
Select select=new Select(multiSelectionBox);
select.selectByVisibleText("Volvo");
select.selectByVisibleText("Hyundai");
select.selectByValue("swiftx");
//select.deselectAll();
/*select.selectByIndex(3);
select.deselectByVisibleText("Volvo");
select.deselectByValue("swiftx");
select.deselectByIndex(3);
select.deselectAll();
System.out.println(select.isMultiple());*/
/*List<WebElement> show = select.getOptions();
for(WebElement h:show)
{
	System.out.println(h.getText());
}*/

List<WebElement> show = select.getAllSelectedOptions();
for(WebElement h:show)
{
	System.out.println(h.getText());
}
WebElement h = select.getFirstSelectedOption();
System.out.println(h.getText());
	}

}
