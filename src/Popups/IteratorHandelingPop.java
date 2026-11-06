package Popups;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class IteratorHandelingPop {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		
		Set<String> allTabs=driver.getWindowHandles();
		Iterator<String> al=allTabs.iterator();
		
		String pTab=al.next();
		String child1=al.next();
		String child2=al.next();
		String child3=al.next();
		
		WebDriver ch3 = driver.switchTo().window(child3);
		System.out.println(ch3.getTitle());
		
		File temp=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshort/Scr.png");
		FileHandler.copy(temp,perm);
		driver.quit();
	}
}