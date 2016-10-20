package com.project.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class makemytrip {
	@Test
	public void testgoogle() throws InterruptedException{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//String pw=driver.getWindowHandle();
		driver.get( "https://www.makemytrip.com/");
		String pw=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath( "// a[@ class='all_menuitem alC']")).click();
		driver.findElement(By.xpath("// a[@ href='//www.makemytrip.com/holidays-india']")).click();
		Set<String> allwin=driver.getWindowHandles();
		String start=" ";
		for(String s:allwin)
		{
			if(s.equals(pw)==false)
			{
				
				
				driver.switchTo().window( s);
				start=s;
				System.out.println(s);
				break;
			}
		}
		
			System.out.println("current url"+driver.getCurrentUrl());
			
			driver.findElement(By.xpath( "//input[@ class='typeahead-dep-city input-md form-control field-transparent tt-input']")).sendKeys("jaipur");
			driver.findElement(By.xpath( "//input[@ class='typeahead-dep-city input-md form-control field-transparent tt-input']")).click();
			driver.findElement(By.xpath( "//a [@id='submit-btn-holiday']")).click();
			Set<String> allwindow=driver.getWindowHandles();
			String last=" ";
			for(String si:allwindow)
			{
				if(si.equals(pw)==false)
	
				{
					
					driver.switchTo().window( si);
					last=si;
					System.out.println("second window: "+si);
					break;
				}
			}
			
			System.out.println("current url"+driver.getCurrentUrl());
			driver.findElement(By.xpath(" //p[@class='banner_descrptn RobotoLight destNameLabel' and text()='Uttarakhand']/following::div[1]//a")).click();
			driver.findElement(By.xpath("  //a [@  href='/holidays/india/package?id=24812&depCityId=3769&intid=inspire_Packageview' and @class='flR button view_detls pkgViewDetailLink' ]")).click();
			Set<String> allwindo=driver.getWindowHandles();
			for(String sia:allwindo)
			{
				if(sia.equals(pw)==false && sia.equals(start)==false)
				{
					driver.switchTo().window( sia);
					System.out.println("last window :"+sia);
					break;
				}
			}
			
			System.out.println("current url"+driver.getCurrentUrl());
			driver.findElement(By.xpath("//a [@class='button fullWidth alC rateDate_overlayOpen']")).click();
			driver.findElement(By.xpath(" //a[@ class='close_button rateDate_overlay']")).click();
			driver.close();
			driver.switchTo().window( last);
			driver.close();
			driver.switchTo().window(pw);
			driver.findElement(By.xpath("//a [@id='cls_btn']")).click();
			System.out.println("current url"+driver.getCurrentUrl());
			driver.close();
			
			
			
			
			
			
		}
		
}

