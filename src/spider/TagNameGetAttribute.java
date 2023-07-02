package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameGetAttribute {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("input"));
		 for(WebElement e:alllinks)
		 {
			 System.out.println(e.getAttribute("type"));
		 }
		 driver.quit();
		// TODO Auto-generated method stub

	}

}
