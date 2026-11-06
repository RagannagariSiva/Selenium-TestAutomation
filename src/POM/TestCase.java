package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		TestLoginPage tp=new TestLoginPage(driver);
		tp.enterUsername("Student");
		tp.enterPassword("Password123");
		tp.clickSubmit();
	}
}
