package spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic2 {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","./drivers/Edgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		By fruits=By.id("fruits");
        By language=By.id("lang");
        addDropDownfield(fruits,"Orange");
        addDropDownfield(language,"Java");
	}
	public static WebElement getwebelement(By field)
	{
		return driver.findElement(field);
	}
	public static void addDropDownfield(By field,String options)
	{
		Select select=new Select( getwebelement(field));
		select.selectByVisibleText(options);
	}
        

}
