package com.project.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("1 beforesuite");
	}
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("1 beforetest");
	}
	@BeforeClass
		public void beforeclass()
		{
		System.out.println("1 beforeclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("1 beforemethod");
	}
	@Test
	public void testcase1()
	{
		System.out.println("testcase1");
		
	}
	@Test
	public void testcase2()
	{
		System.out.println("testcase2");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("1 aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("1 afterclass");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("1 aftertest");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("1 aftersuite");
	}
	
	

}
