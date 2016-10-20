package com.project.selenium;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GyTest {
	public class SeleniumDemoTest {
		@Test
		public void testgoogle() throws InterruptedException, IOException{
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
			  Thread.sleep(5000);
			     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"t");
			     //driver.get("http://yahoo.com");
			     driver.get("https://login.yahoo.com");
			     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"\t");
			    // Thread.sleep(5000);
			     driver.switchTo().defaultContent();
			     driver.findElement(By.xpath("//input[@ id='Email']")).click();
			     driver.findElement(By.xpath("//input[@ id='Email']")).sendKeys("");
					driver.findElement(By.xpath("//input[@ id='next' ]")).click();
					driver.findElement(By.xpath("//input [@id='Passwd'] ")).sendKeys("");
					driver.findElement(By.xpath("//input [@id='signIn']")).click();
					  driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"\t");
					     driver.switchTo().defaultContent();
					     driver.findElement(By.xpath("//input[@ id='login-username']")).sendKeys("");
					     driver.findElement(By.xpath("//button [@id='login-signin']")).click();
					     Thread.sleep(5000);
					     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
					     driver.findElement(By.xpath("//button [@id='login-signin']")).click();
					     Thread.sleep(5000);
					     driver.findElement(By.xpath("//b[@ title='Mail']")).click();
					     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"\t");
					     driver.switchTo().defaultContent();
					     driver.findElement(By.xpath("//span[@ class='gb_8a gbii']")).click();
					     driver.findElement(By.xpath("//a[@ id='gb_71']")).click();
					     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"\t");
					     driver.switchTo().defaultContent();
					     Thread.sleep(5000);
					     Actions action=new Actions(driver);
					     action.moveToElement(driver.findElement(By.xpath("//li[@id='yucs-profile']/a[1]"))).build().perform();
					     driver.findElement(By.id("yucs-signout")).click();
					     Thread.sleep(5000);
					     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"\t");
					     driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"w");
					     Thread.sleep(5000);
					     driver.close();
			
	
	
	
	
	
	
	
	

}
	}
}

