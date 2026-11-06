package Scroll;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBordActions 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/NameFiles.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Fn = driver.findElement(By.id("fn"));
		WebElement Mn = driver.findElement(By.name("mn"));
		WebElement Ln = driver.findElement(By.name("ln"));
	    Fn.sendKeys("&&&&&&&&&&&");
	    Mn.sendKeys("$$$$$$$$$$$");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.keyDown(Fn,Keys.CONTROL).sendKeys("ax").keyUp(Fn,Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Ln,Keys.CONTROL).sendKeys("v").keyUp(Ln,Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Mn,Keys.CONTROL).sendKeys("ax").keyUp(Mn, Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Fn,Keys.CONTROL).sendKeys("v").keyUp(Fn, Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Ln,Keys.CONTROL).sendKeys("ax").keyUp(Ln, Keys.CONTROL).perform();
		Thread.sleep(2000);
		act.keyDown(Mn,Keys.CONTROL).sendKeys("v").keyUp(Mn, Keys.CONTROL).perform();
	}

}
