package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatedById {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/Example1.html");
		WebElement link=driver.findElement(By.id("Link"));
		link.click();
		driver.quit();
	}

}
