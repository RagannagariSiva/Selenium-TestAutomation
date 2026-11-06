package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.latest.page.model.NavigatedWithinDocument;
import org.openqa.selenium.safari.SafariDriver;

public class Navigation 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new SafariDriver();
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
