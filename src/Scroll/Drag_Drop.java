package Scroll;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src11=driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement dst11=driver.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		
		WebElement src21=driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement dst21=driver.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		
		WebElement src12=driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement dst12=driver.findElement(By.xpath("(//div[.='Mobile Accessories'])[1]"));
		
		WebElement src22=driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		WebElement dst22=driver.findElement(By.xpath("(//div[.='Laptop Accessories'])[1]"));
		
		Actions	act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src11, dst11).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src21, src21).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src12, dst12).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src22, dst22).perform();
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
