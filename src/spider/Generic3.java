package spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic3 {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","./drivers/Edgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		By fruits=By.id("fruits");
		By language=By.id("lang");
		By superhero=By.id("superheros");
		selectOptionInDropDownByVisibleText(fruits,"Orange");
		selectOptionInDropDownByIndex(language,"3");
		selectOptionInDropDownByValue(superhero,"ca");
	}public static WebElement getwebElement(By field)
	{
		return driver.findElement(field);

	}
	public static void selectOptionInDropDownByVisibleText(By field,String optionsText)
	{
		Select select =new Select(getwebElement(field));
		select.selectByVisibleText(optionsText);
	}
	public static void selectOptionInDropDownByIndex(By field,String OptionsIndex)
	{
	 Select select2=new Select(getwebElement(field));
	 select2.selectByIndex(Integer.parseInt(OptionsIndex));
	}
	public static void  selectOptionInDropDownByValue(By field,String optionValue
			)
	{
		 Select select3=new Select(getwebElement(field));
		 select3.selectByValue(optionValue);
	}

}
