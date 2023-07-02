package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelements2 {
	public static void main(String[] args) throws InterruptedException {

	ChromeOptions opt=new ChromeOptions();
	
opt.addArguments("--remote-allow-origins=*");
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver(opt);
driver.get("http://omayo.blogspot.com/");
driver.manage().window().maximize();
List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
int numboflink=links.size();
String path="(//div[@id='LinkList1']//a)";
for(int i=1;i<=numboflink;i++)
{
	String elementPath=path+"["+i+"]";
	driver.findElement(By.xpath(elementPath)).click();
	driver.navigate().back();
}
driver.quit();
	}
}

