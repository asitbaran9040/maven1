package spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/Edgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		By fruits=By.id("fruits");
        By language=By.id("lang");
       Select select1=new Select(driver.findElement(fruits));
       select1.selectByVisibleText("Orange");
       Select select2=new Select(driver.findElement(language));
       select2.selectByVisibleText("Java");
	}
       

}
