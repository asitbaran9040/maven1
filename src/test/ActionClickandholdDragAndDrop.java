package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickandholdDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement oslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement itly = driver.findElement(By.id("box106"));
Actions actions=new Actions(driver);
//actions.clickAndHold(oslo).moveToElement(itly).release().build().perform();
actions.dragAndDrop(oslo, itly).perform();
driver.close();
	}

}
