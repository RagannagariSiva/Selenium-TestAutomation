package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class whyPOM {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement usn = driver.findElement(By.id("username"));
		WebElement psw = driver.findElement(By.id("password"));
		WebElement sub = driver.findElement(By.id("submit"));
		usn.sendKeys("Student");
		driver.navigate().refresh();
		usn.sendKeys("Student");
		psw.sendKeys("Password123");
		sub.click();
		driver.quit();
	}

}
