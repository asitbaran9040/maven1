package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5szpgfto9j_e&adgrpid=1320515071595367&hvadid=82532451009254&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=1669&hvtargid=kwd-82533067351416:loc-90&hydadcr=14452_2154372");
WebElement enter = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
enter.sendKeys("iphone");
Thread.sleep(4000);
List<WebElement> option = driver.findElements(By.xpath("//div[@role='button']"));
for(int i=0;i<option.size();i++)
{
	if(option.get(i).getText().equalsIgnoreCase("iphone 14"))
	{
		option.get(i).click();
	}
}
	}

}
