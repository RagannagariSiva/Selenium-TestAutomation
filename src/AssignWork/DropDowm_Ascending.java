package AssignWork;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowm_Ascending {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		List<WebElement> options = s.getOptions();
		
		TreeSet<String>tree=new TreeSet<String>();
		
		for(WebElement opt:options)
		{
			String text=opt.getText();
			System.out.println(opt.getText());
			tree.add(text);
		}
		
		System.out.println("==============================");
		
		for(String text:tree)
		{
			System.out.println(text);
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
