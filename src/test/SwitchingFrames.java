package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
	 List<WebElement> frames = driver.findElements(By.tagName("frame"));
	int noOfframe=frames.size();
	int s=0;
	int index=0;
	for(int i=0;i<noOfframe;i++)
	{
		driver.switchTo().frame(i);
	s=	driver.findElements(By.linkText("Description")).size();
	System.out.println(s);
		if(s>0)
		{
			index=i;
			driver.switchTo().parentFrame();
			break;
		}
		driver.switchTo().parentFrame();
	}
	driver.switchTo().frame(index);
	driver.findElement(By.linkText("Description")).click();

	}

}
