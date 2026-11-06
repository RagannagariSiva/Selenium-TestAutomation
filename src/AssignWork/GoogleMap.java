package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9989714,77.5504773,15z?entry=ttu&g_ep=EgoyMDI2MDgyNi4wIKXMDSoASAFQAw%3D%3D");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ZBTq6e' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("Rayachoty, Andhra Pradesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ZBTq6e' and @aria-controls='sbsg51']")).sendKeys("Hyderabad, Telangana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='mL3xi' and @jslog='11887']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
