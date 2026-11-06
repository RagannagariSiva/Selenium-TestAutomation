package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginHandelingmethod 
{
	WebDriver driver;
	@BeforeMethod
	public void validlogin()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("submit")).click();
		
	}
	@Test
	public void invalidlogin()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("studentRaju");
		driver.findElement(By.id("password")).sendKeys("password123123");
		driver.findElement(By.id("submit")).click();
		
	}
	public void closed()
	{
		driver.close();
	}

}
