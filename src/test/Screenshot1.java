package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement field = driver.findElement(By.xpath("(//div[@class='row'])[3]"));
		File src1=field.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./screenshots/logincontent1.png"));
		// TODO Auto-generated method stub

	}

}
