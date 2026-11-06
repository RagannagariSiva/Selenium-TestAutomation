package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExecution_02 
{
	@Test
	public void tc4()
	{
		Reporter.log("tc1 is passed",true);
	}
	@Test
	public void tc5()
	{
		Reporter.log("tc1 is failed",false);
	}
	@Test
	public void tc6()
	{
		Reporter.log("tc1 is failed",false);
	}

}
