package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLoginPage
{
	//Declearation [Lacators]
	private WebDriver driver;
	private By usn_Tf=By.id("username");
	private By psw_Tf=By.id("password");
	private By sub_bt=By.id("submit");
	
	//Initilization //receive the address of the brower
	
	public TestLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterUsername(String usn)
	{
		driver.findElement(usn_Tf).sendKeys(usn);
	}
	public void enterPassword(String psw)
	{
		driver.findElement(psw_Tf).sendKeys(psw);
	}
	public void clickSubmit()
	{
		driver.findElement(sub_bt).click();
	}

}
