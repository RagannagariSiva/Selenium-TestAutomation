package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_option {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		s.selectByIndex(4);
	    Thread.sleep(2000);
		s.selectByValue("burger");
		Thread.sleep(2000);
		s.selectByVisibleText("Chicken 65");
	    Thread.sleep(2000);
		s.selectByContainsVisibleText("i");
		Thread.sleep(2000);
		
		
		s.deselectByIndex(4);
		Thread.sleep(2000);
		s.deselectByValue("pizza");
		Thread.sleep(2000);
		s.deselectByVisibleText("Chicken 65");
		Thread.sleep(2000);
		s.deSelectByContainsVisibleText("i");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
