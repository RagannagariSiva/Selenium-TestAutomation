package Scroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActions_Amount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.scrollByAmount(0, 1500).perform();//vertical scrolldown
		Thread.sleep(2000);
		act.scrollByAmount(0, -1000).perform();//vertical scrollup
		
//		act.scrollByAmount(1000,0).perform();//horizantal scrolldown
//		Thread.sleep(2000);
//		act.scrollByAmount(900,0).perform();//horizontal scrollup
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
