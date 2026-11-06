package AssignWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExercise {
		public static void main(String[] args) throws InterruptedException {
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://automationexercise.com/");
			  Thread.sleep(3000);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("a[href='/login']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("name")).sendKeys("kjhg");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("Jd143@gmail.com");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("label[for='id_gender2']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("password")).sendKeys("pengi%^*");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("#newsletter")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("optin")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("first_name")).sendKeys("mn1121");
			  Thread.sleep(2000);
			  driver.findElement(By.id("last_name")).sendKeys("end");
			  Thread.sleep(2000);
			  driver.findElement(By.name("company")).sendKeys("JDcompany");
			  Thread.sleep(2000);
			  driver.findElement(By.id("address1")).sendKeys("Bangalore");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("#state")).sendKeys("Karnataka");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector(" #city")).sendKeys("Bangalore");
			  Thread.sleep(2000);
			  driver.findElement(By.cssSelector("input[data-qa='zipcode']")).sendKeys("560060");
			  Thread.sleep(2000);
			  driver.findElement(By.id("mobile_number")).sendKeys("7090886258");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//a[@href='/delete_account' and @style='color:brown;']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//a[@href='/' and @data-qa='continue-button']")).click();
			  Thread.sleep(2000);
              driver.quit();
			
			  
		}
	}
