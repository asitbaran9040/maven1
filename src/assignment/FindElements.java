package assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		By fruits=By.id("fruits");
		By language=By.id("lang");
	By superhero=By.id("superheros");
	SelectDropDownFieldByVisibleText(fruits,"Orange");
	SelectDropDownFieldByindex(language,"3");
	selectDropDownFieldByvalue(superhero,"ca");
	}
	public static WebElement getwebElement(By field)
	{
		return driver.findElement(field);
	}
	public static void SelectDropDownFieldByVisibleText(By field,String options)
	{
		Select select=new Select( getwebElement(field));
		select.selectByVisibleText(options);
				
	}
	public static void SelectDropDownFieldByindex(By field,String optionsindex)
	{
		Select select=new Select(getwebElement(field));
		select.selectByIndex(Integer.parseInt(optionsindex) );
	}
	public static void selectDropDownFieldByvalue(By field,String optionsValue)
	{
		Select select=new Select(getwebElement(field));
		select.selectByValue(optionsValue);
	}
}
		