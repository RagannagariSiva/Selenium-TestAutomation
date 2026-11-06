package TestNG;

import org.testng.annotations.Test;

public class Inovactioncount_Ass 
{
	@Test(invocationCount = 1)
	public void tc1()
	{
		System.out.println("tc1 is executed");
		
	}
	@Test(invocationCount = 9)
	public void tc2()
	{
		System.out.println("tc2 is executed");
		
	}
	@Test(invocationCount = 3)
	public void tc3()
	{
		System.out.println("tc3 is executed");
		
	}

}
