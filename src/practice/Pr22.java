package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr22 {

	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	List<WebElement> age = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));
System.out.println(age.size());
int t=0;
int sum=0;
String s;
for(int i=0;i<age.size();i++)
{
	s=age.get(i).getText();
	t=Integer.parseInt(s);
	sum=sum+t;
	
	
		
	
}
System.out.println(sum);

	}

}
