package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimesationsGetSize {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension d=new Dimension(200,400);
		System.out.println("Size of the Browser: "+d);
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println("Height: "+h);
		System.out.println("Width: "+w);
		driver.quit();
	}

}
