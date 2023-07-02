package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr9 {
	public static void main(String[]args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("(//div[@style='height: 64px; width: 64px;'])[2]")).click();

}//button[@class='_2KpZ6l _2doB4z']
}
