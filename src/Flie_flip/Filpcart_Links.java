package Flie_flip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filpcart_Links {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
		Thread.sleep(2000);
	     List<WebElement> links=driver.findElements(By.xpath("//a"));
	     Thread.sleep(2000);
	     for(WebElement link: links)
	     {
	    	String text=link.getText();
//	    	if(text.length()>0)
//	    	{
//	    		System.out.println(text);
//	    	}
	    	if(!text.isEmpty())
	    	{
	    		System.out.println(text);
	    	}
	     }
	     Thread.sleep(2000);
	     driver.quit();
	}

}
