package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		WebElement rb=driver.findElement(By.xpath("//input[@value='Upi']/following-sibling::span"));
		Thread.sleep(2000);
		System.out.println(rb.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
