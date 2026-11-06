package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenSrort {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		TakesScreenshot st = (TakesScreenshot)driver;
		File temp = st.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshort/defect.png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		driver.quit();		
	}

}
