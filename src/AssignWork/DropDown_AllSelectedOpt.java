package AssignWork;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_AllSelectedOpt 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		s.selectByIndex(4);
		s.selectByIndex(5);
		s.selectByIndex(2);
		
		List<WebElement> options = s.getAllSelectedOptions();
		
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		
	}

}
