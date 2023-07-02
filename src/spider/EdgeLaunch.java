package spider;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msegde.driver","./drivers/msedgedriver.exe");
		
EdgeDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/sql/sql_exercises.asp");
Thread.sleep(4000);
driver.close();

	}

}
