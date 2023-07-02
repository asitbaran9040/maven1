package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionResizing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		WebElement frames = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frames);
		WebElement drag = driver.findElement(By.cssSelector("div[class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(drag, 100, 120).perform();
		

	}

}
