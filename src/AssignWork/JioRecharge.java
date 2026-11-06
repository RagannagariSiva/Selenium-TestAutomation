package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioRecharge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("jds-text")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Recharge for ₹3599']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Jio Number']")).sendKeys("7985‑23‑5609");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class ='jds_fullWidth__1ucQu j-button j-button-size__medium primary']")).click();
		Thread.sleep(5000);
		//driver.quit();
	}
}
