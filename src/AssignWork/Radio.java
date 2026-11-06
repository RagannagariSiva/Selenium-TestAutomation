package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		WebElement rb=driver.findElement(By.xpath("//input[@value='Url']"));
		if(rb.isDisplayed())
		{
			System.out.println("rb is Displayed");
			if(rb.isEnabled())
			{
				System.out.println("rb is Enabled");
				if(rb.isSelected()) {
					System.out.println("rb is Selected");
				}
				else {
					System.out.println("rb is Selected");
					rb.click();
					Thread.sleep(2000);
				}
			}
			else 
			{
				System.out.println("rb is Enabled");
			}
			
		}
		else
		{
			System.out.println("rb is not Displayed");
		}
	}

}

