package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr16 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		
		List<String>list = new ArrayList<>();
		list.add("disable-notifications");
		list.add("start-maximized");
		opt.addArguments(list);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.goindigo.in/?cid=Display|Affiliate|LF|LA11|2994_275");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='close-cookie']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Travel Date']")).click();
		WebElement monthyear1 = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]"));
		WebElement monthyear2 = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]"));
String my1 = monthyear1.getText();
String my2 = monthyear2.getText();
while((!(my1.equals("Janauary 2024")))&&(!(my2.equals("February 2024"))))
{
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	 WebElement newmonthyear1 = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]"));
	WebElement newmonthyear2 = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]"));
	my1 = newmonthyear1.getText();
	 my2 = newmonthyear2.getText();
	
}
driver.findElement(By.xpath("(//a[.='25'])[1]")).click();
driver.findElement(By.xpath("//input[@placeholder='Travel Date']")).click();
System.out.println(driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText());
driver.close();
	}

}
