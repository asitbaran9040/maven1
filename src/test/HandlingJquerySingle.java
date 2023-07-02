package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJquerySingle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement singleselectiondropdown = driver.findElement(By.id("justAnotherInputBox"));
		singleselectiondropdown.click();
		Thread.sleep(2000);
		WebElement getElement = driver.findElement(By.xpath("(//span[text()='choice 3'])[3]"));
		getElement.click();
		// TODO Auto-generated method stub

	}

}
//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
