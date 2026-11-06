package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingScrollactions 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,900)"); //ScrollDown
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,-300)");//ScrollUp
//        Scroll full bottom & top
//        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        Thread.sleep(2000);
        driver.quit();
        
	}

}
