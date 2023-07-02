package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pr7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
Thread.sleep(2000);
WebElement days = driver.findElement(By.xpath("//select[@title='Day']"));
Select select=new Select(days);
select.selectByVisibleText("28");
WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
Select select1=new Select(month);
select1.selectByValue("9");
WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
Select select2=new Select(year);
select2.selectByIndex(27);
	}

}
