package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExecution_01
{
	@Test
	public void tc1()
	{
		Reporter.log("tc1 is passed",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("tc1 is failed",false);
	}
	@Test
	public void tc3()
	{
		Reporter.log("tc1 is passed",true);
	}

}
