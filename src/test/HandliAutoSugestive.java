package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class HandliAutoSugestive {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_"
		+ "Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%5B&ef_id="
		+ "4a639c98ed321bc2e9a7f8d818dfc46b:G:s");

WebElement logo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
Actions action=new Actions(driver);
action.moveToElement(logo).click().build().perform();
Thread.sleep(2000);
driver.findElement(By.id("fromCity")).click();
WebElement f = driver.findElement(By.xpath("//input[@placeholder='From']"));
f.sendKeys("bang");
for(int i=1;i<=3;i++)
{
	f.sendKeys(Keys.ARROW_DOWN);
} f.sendKeys(Keys.ENTER);

	}

}
