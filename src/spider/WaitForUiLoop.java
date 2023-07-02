package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitForUiLoop {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//div[@id='start']//button")).click();
		List<WebElement> processing = driver.findElements(By.xpath("//div[@id='loading']/img"));
	int count=0;
	while(processing.size()!=0 && count<=10)
	{
		Thread.sleep(1000);
		count++;
	}
			WebElement text5 = driver.findElement(By.xpath("//div[@id='finish']//h4"));
			String text = text5.getText();
			System.out.println(text);
			
			driver.quit();
		

}}
