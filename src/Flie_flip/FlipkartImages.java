package Flie_flip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartImages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
		Thread.sleep(2000);
	    List<WebElement> links=driver.findElements(By.xpath("//img"));
	     for(int i=0;i<links.size();i++)
	     {
	    	 WebElement link=links.get(i);
	    	 String url=link.getAttribute("src");
	    	 System.out.println(url);
	     }
	     Thread.sleep(2000);
	     driver.quit();
	}

}
