package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26']")).sendKeys("Puma shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='XFwMiH' and @type='submit']")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//a[@class='atJtCj']"));
		for(int i=0;i<ele.size();i++)
		{
			 WebElement element = ele.get(i);
			 String name = element.getText();
			 System.out.println(name);
	}
		 List<WebElement> amount = driver.findElements(By.xpath("//div[@class='hZ3P6w']"));
		
		for(int i=0;i<amount.size();i++)
		{
			 WebElement image = amount.get(i);
			 String price = image.getText();
			 System.out.println(price);
	}
		for(int i = 0; i < ele.size() && i < amount.size(); i++) {

		    String name = ele.get(i).getText();
		    String price = amount.get(i).getText();

		    System.out.println(name + " ---- " + price);
		}
		 
	}
}