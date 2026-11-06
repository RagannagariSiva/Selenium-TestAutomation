package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement nameTF=driver.findElement(By.id("email"));
		nameTF.sendKeys("Selenium1234@gmail.com");
		Actions	act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(nameTF).perform();
//      act.moveToElement(nameTF).doubleClick().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
