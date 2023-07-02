package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr11 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.myntra.com/shop/men");
WebElement men = driver.findElement(By.xpath("(//a[@data-type='navElements'])[1]"));
WebElement sweater = driver.findElement(By.xpath("//a[text()='Sweaters']"));
Actions action =new Actions(driver);
action.moveToElement(men).perform();
action.pause(Duration.ofSeconds(2));
action.moveToElement(sweater).click().perform();



	}

}
