package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
			  WebDriver driver = new FirefoxDriver();
			  driver.get("https://www.youtube.com/");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("input[class='ytSearchboxComponentInput yt-searchbox-input title']")).sendKeys("neenendare nannage ista kano");
			  driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.className("ytCoreImageHost")).click();
			  Thread.sleep(3000);
			  driver.quit();
//			  driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ningavva ningavva");
//			  driver.findElement(By.cssSelector("button[class='ytSearchboxComponentSearchButton']")).click();
//			  Thread.sleep(3000);
//			  driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
//			  Thread.sleep(3000);
			  driver.quit();
	
	}

}
