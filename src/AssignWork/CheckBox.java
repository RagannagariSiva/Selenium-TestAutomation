package AssignWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/CheckBox.html");
//		driver.findElement(By.xpath("//input"));
//		driver.findElement(By.xpath("//input[1]"));
//		driver.findElement(By.xpath("(//input)[3]"));
//		driver.findElement(By.xpath("(//input)[last]"));
//		driver.findElement(By.xpath("(//input)[last-2]"));
//		driver.findElement(By.xpath("(//input)[position()>3]"));
	
		List<WebElement> checkbox=driver.findElements(By.xpath("//input"));
		for(int i=0;i<checkbox.size();i++)
		{
			if(i%2==0)
			{
				WebElement check= checkbox.get(i);
				check.click();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
