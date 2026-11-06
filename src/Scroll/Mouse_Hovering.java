package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement btt=driver.findElement(By.xpath("//a[.='PlaywrightPractice']"));
		Actions	act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(btt).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
