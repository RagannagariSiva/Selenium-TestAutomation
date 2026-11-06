package Scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement circle=driver.findElement(By.id("circle"));
		Actions	act=new Actions(driver);
		Thread.sleep(2000);
		
		act.clickAndHold(circle)
		.pause(Duration.ofSeconds(2))
		.release()
		.perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
