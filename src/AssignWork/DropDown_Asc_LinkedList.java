package AssignWork;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Asc_LinkedList 
{
// Reverse Order
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		List<WebElement> options = s.getOptions();
		
		LinkedList<String> al=new LinkedList<String>();
		
		for(WebElement opt:options)
		{
			String text=opt.getText();
			System.out.println(opt.getText());
			al.add(text);
		}
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("==============================");
		
		for(String text:al)
		{
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
