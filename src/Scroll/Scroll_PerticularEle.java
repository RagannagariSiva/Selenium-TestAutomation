package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_PerticularEle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Continue shopping']")).click();
		Thread.sleep(2000);
		WebElement coup = driver.findElement(By.xpath("//a[.='Coupons']"));
		Actions act=new Actions(driver);
		act.scrollToElement(coup).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
