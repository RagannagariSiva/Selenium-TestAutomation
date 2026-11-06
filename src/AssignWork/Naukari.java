package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='What is your name?']")).sendKeys("Rajesh Raj");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Tell us your Email ID']")).sendKeys("rajesh23254321@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Rajesh@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='mobile']")).sendKeys("9737376623");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='textWrap']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='submitbtn resman-btn-primary resman-btn-regular resman-btn-disabled']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
