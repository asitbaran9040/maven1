package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
	
	opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
	for(WebElement e:options)
	{
		System.out.println(e.getText());
		
	}driver.close();

}
}
