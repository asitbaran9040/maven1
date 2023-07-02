package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentChildSiblingFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String leftframe = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
	System.out.println(leftframe);
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-middle");
	String middleframe = driver.findElement(By.xpath("//body")).getText();
	System.out.println(middleframe);
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-right");
	String rightframe = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
	System.out.println(rightframe);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame-bottom");
	String bottomframe = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	System.out.println(bottomframe);
	driver.close();
	}

}
