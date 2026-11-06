package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotifactionsFireFox {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxOptions fs=new FirefoxOptions();
		fs.addPreference("dom.webnotifications.enabled", false);
		//fs.addArguments("--headless");
		WebDriver driver=new FirefoxDriver(fs);
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Notification']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
