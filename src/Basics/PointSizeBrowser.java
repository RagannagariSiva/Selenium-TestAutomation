package Basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointSizeBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		Point loc=driver.manage().window().getPosition();
		System.out.println("The Location of Browser: "+loc);
		int x=loc.getX();
		int y=loc.getY();
		System.out.println("X-axis is: "+x);
		System.out.println("Y-axis is: "+y);
		driver.quit();
	}

}
