package Scroll;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selected_Selenium {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		WebElement about = driver.findElement(By.xpath("//a[.='About']"));
//		Actions act=new Actions(driver);
//		act.contextClick(about).perform();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		WebElement dow = driver.findElement(By.xpath("//span[.='Downloads']"));
//		act.contextClick(dow).perform();
//		Robot k=new Robot();
//		k.keyPress(KeyEvent.VK_DOWN);
//		k.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		WebElement doc = driver.findElement(By.xpath("//span[.='Documentation']"));
//		Robot l=new Robot();
//		l.keyPress(KeyEvent.VK_DOWN);
//		l.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		WebElement proj = driver.findElement(By.xpath("//span[.='Projects']"));
//		Robot m=new Robot();
//		m.keyPress(KeyEvent.VK_DOWN);
//		m.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		WebElement blog = driver.findElement(By.xpath("//span[.='Blog']"));
//		Robot n=new Robot();
//		n.keyPress(KeyEvent.VK_DOWN);
//		n.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
//		driver.quit();
		
		
		List<WebElement> Fc = driver.findElements(By.className("navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2"));
		
		for(int i=0;i<Fc.size();i++)
		{
			
		}
		
	}
}
