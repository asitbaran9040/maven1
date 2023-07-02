package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String gname="praveen";
		
List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
int row=0;
for(int i=0;i<alldata.size();i++)
{
	if(alldata.get(i).getText().equalsIgnoreCase(gname))
	{
		row=i;
	}
}
String xpath = "//table[@id='table1']//tr["+(row+1)+"]//td[3]";

    System.out.println(driver.findElement(By.xpath(xpath)).getText());


	}
}
