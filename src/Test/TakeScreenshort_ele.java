package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshort_ele
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://leetcode.com/");
	    Thread.sleep(2000);
		
		WebElement st = driver.findElement(By.xpath("//a[@class='btn sign-up-btn hover-panel round']"));
		Thread.sleep(2000);
		
		File temp = st.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshort/Element.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();		
	}
}
