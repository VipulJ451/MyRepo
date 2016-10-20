package testng.vipul.jain.,gspann;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("2 beforesuite");
	}
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("2 beforetest");
	}
	@BeforeClass
		public void beforeclass()
		{
		System.out.println("2 beforeclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("2 beforemethod");
	}
	@org.testng.annotations.Test
	public void testcase1()
	{
		System.out.println("testcase1");
		
	}
	@org.testng.annotations.Test
	public void testcase2()
	{
		System.out.println("testcase2");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("2 aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("2 afterclass");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("2 aftertest");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("2 aftersuite");
	}
	
	


}
