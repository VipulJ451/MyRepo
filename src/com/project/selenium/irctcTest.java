package com.project.selenium;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class irctcTest {
	public class SeleniumDemoTest {
		@Test
		public void testgoogle() throws InterruptedException, IOException{
			//WebDriver driver= new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","D:/chrome/v/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			String pw=driver.getWindowHandle();
			driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
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
			driver.findElement(By.xpath("//input[@ id='origin']")).sendKeys("delhi");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@ id='origin']")).sendKeys(Keys.TAB)  ;
			driver.findElement(By.xpath(" //input[@ id='destination']")).sendKeys("jaipur");
			Thread.sleep(3000);
			driver.findElement(By.xpath(" //input[@ id='destination']")).sendKeys(Keys.TAB );
			driver.findElement(By.xpath( "// input[@ id='departDate']")).sendKeys( "09/12/2016");
			Select sel= new Select(driver.findElement(By.id("noOfAdult")));
			sel.selectByValue("2");
			Select se= new Select(driver.findElement(By.id("noOfChild")));
			se.selectByValue("2");
			driver.findElement(By.xpath (" //div[@ id='showdometic']/div[@class='srchbtn']")).click();
			List<WebElement>allList=driver.findElements(By.className( "onewayflightinfo"));
			System.out.println(allList.size());
			
			
		 
			
	
	
	
	
	
	
	
	
		}
}
}
