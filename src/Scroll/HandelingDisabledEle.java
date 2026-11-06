package Scroll;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingDisabledEle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/DisabledElements.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Handeling Disabled Elements with Id Attribute
        js.executeScript("document.getElementById('usn').value='Admin' ");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('usn').value='' ");
        Thread.sleep(2000);
        //Handeling Disabled elements without using Id attribute
        WebElement pswTf=driver.findElement(By.name("password"));
        js.executeScript("arguments[0].value='Password@123' ",pswTf);
        Thread.sleep(2000);
        js.executeScript("arguments[0].value='' ",pswTf);
        Thread.sleep(2000);
        driver.quit();
        
	}

}
