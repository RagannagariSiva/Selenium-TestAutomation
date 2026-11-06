package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DrropDown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			System.out.println("Selected  multiple options");
		}else
		{
			System.out.println("Selected  single options");
		}
	}

}
