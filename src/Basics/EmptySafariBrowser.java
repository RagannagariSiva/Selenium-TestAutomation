package Basics;

import org.openqa.selenium.safari.SafariDriver;

public class EmptySafariBrowser {

	public static void main(String[] args)
	{
		SafariDriver driver=new SafariDriver();
		driver.get("https://github.com/");
	}		

}
  	