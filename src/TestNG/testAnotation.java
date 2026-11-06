package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testAnotation
{
	@BeforeSuite
	public void Beforesuit()
	{
		System.out.println("Before Suite is executed");
	}
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Before Test is executed");
	}
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before class is executed");
	}

	@BeforeMethod
	public void Beforemethod()
	{
		System.out.println("Before method is executed");
	}

}
