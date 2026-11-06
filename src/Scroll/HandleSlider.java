package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/tablets/~cs-r95dcd9vae/pr?sid=tyy,hry&collection-tab-name=Tab-HP%20Omni%20Pad&BU=CoreElectronics");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Continue shopping']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.className("lPYKVv y2Kgh9"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele)
		.moveByOffset(200, 0)
		.release()
		.perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
