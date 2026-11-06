package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/shiva/Documents/Selenium/HTML_files/MainPage.html");
		//Main Page
		WebElement usnTf=driver.findElement(By.id("usn"));//locate element in main page
		usnTf.sendKeys("This is A mainPage"); //perform in  main page element
		//Frame 1
//		WebElement frame1=(WebElement) driver.switchTo().frame(0);
		//using adderess of frame
		WebElement frame=driver.findElement(By.id("f1"));
		WebDriver frame1=driver.switchTo().frame(frame);
		
		WebElement pswTf=frame1.findElement(By.id("psw"));
		pswTf.sendKeys("This is frame1");
		//Frame2
		WebDriver frame2=frame1.switchTo().frame("f2");
		WebElement mobTf=frame2.findElement(By.id("mob"));
		//Swith to frame1 and action
		frame1=frame2.switchTo().parentFrame();
		pswTf.clear();
		//swith to main page
		frame2.switchTo().defaultContent();
		usnTf.clear();

	}

}
