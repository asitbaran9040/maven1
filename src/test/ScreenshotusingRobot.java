package test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotusingRobot {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Robot robot=new Robot();
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle (dimension);
		BufferedImage bufferedimage=robot.createScreenCapture(rect);
		String screenshotpath=System.getProperty("user.dir")+"//screenshots//robottwo.png";
		ImageIO.write(bufferedimage, "png",new File(screenshotpath));
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		

	}

}
