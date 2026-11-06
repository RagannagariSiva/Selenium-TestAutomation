package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Multiple_Browsers {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		          driver=new FirefoxDriver();
		          driver=new SafariDriver();
	}

}
