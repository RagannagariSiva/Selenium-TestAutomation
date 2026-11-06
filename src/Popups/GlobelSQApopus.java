package Popups;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobelSQApopus 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
	}

}
