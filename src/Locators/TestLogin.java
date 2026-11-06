package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement un=driver.findElement(By.id("username"));
		WebElement  psw=driver.findElement(By.name("password"));
		un.sendKeys("student");
		psw.sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
