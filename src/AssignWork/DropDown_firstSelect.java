package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_firstSelect {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DropDowm.html");
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select s=new Select(dropdown);
		s.selectByIndex(4);
		s.selectByIndex(0);
		WebElement option=s.getFirstSelectedOption();
		System.out.println(option.getText());
		driver.quit();
	}

}
