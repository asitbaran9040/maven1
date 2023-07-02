package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJqueryMultipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
	By multiselection = By.id("justAnInputBox");
	driver.findElement(multiselection).click();
		/*driver.findElement(By.xpath("(//span[text()='choice 1  '])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='choice 2'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='choice 2 2'])[1]")).click();*/
	
List<WebElement> allelement = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
for(WebElement a: allelement)
{
	try {
		a.click();
	}catch(Exception e)
	{
		System.out.println("programdone");
	}
}
	}

}
