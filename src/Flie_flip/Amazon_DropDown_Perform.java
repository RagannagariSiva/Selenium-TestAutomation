package Flie_flip;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_DropDown_Perform {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("Puma Shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(2000);
		
		WebElement dropd=driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']/li/a"));
		Select s3=new Select(dropd);
		List<WebElement> options = s3.getOptions();
		LinkedList<String> state=new LinkedList<String>();
		for(WebElement w3:options)
		{
			String text=w3.getText();
			System.out.println(w3.getText());
			state.add(text);
		}
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	   
		
		
	}

}
