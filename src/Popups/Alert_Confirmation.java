package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Confirmation {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Levis Shirt']/preceding-sibling::td[1]/input")).click();
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		Alert pop = driver.switchTo().alert();
		pop.getText();
		pop.accept();
		//pop.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
