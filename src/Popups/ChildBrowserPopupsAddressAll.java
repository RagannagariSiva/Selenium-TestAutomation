package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopupsAddressAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String pTab=driver.getWindowHandle();
		System.out.println("The Address of parent tab is: "+pTab);
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println("Total no.of tabs are: "+allTabs.size());
		for(String tab:allTabs)
		{
			System.out.println(tab);
		}
	}

}
