package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformClickActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/Example2.html");
		WebElement un=driver.findElement(By.id("usn"));
		WebElement  psw=driver.findElement(By.name("Password"));
		un.sendKeys("Shiva");
		psw.sendKeys("Royal@123456");
		driver.findElement(By.id("you")).click();
		driver.quit();
	}

}
