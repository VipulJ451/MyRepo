package com.project.selenium;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest {
	public class SeleniumDemoTest {
		@Test
		public void testgoogle() throws InterruptedException, IOException{
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
			driver.findElement(By.xpath("//input[@ id='Email']")).sendKeys("vipulj451");
			driver.findElement(By.xpath("//input[@ id='next' ]")).click();
			driver.findElement(By.xpath("//input [@id='Passwd'] ")).sendKeys("cricketmatch");
			driver.findElement(By.xpath("//input [@id='signIn']")).click();
			System.out.println("current title"+driver.getTitle());
			Assert.assertEquals("Gmai", driver.getTitle());
			driver.findElement(By.xpath("//div [@class='T-I J-J5-Ji T-I-KE L3']")).click();
            driver.findElement(By.xpath("  //textarea[@aria-label='To']")).sendKeys( "vipulj451@gmail.com");
            driver.findElement(By.xpath(" //input[@class='aoT']")).sendKeys("Hello hava party");
            driver.findElement(By.xpath(" //div[@class='Am Al editable LW-avf'] ")).sendKeys("Hi /n vipul");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
             
           driver.findElement(By.xpath(" //span [@class='gb_8a gbii']")).click();
           driver.findElement(By.xpath("//a [@id='gb_71']")).click(); 
            
	        //driver.close();
	
	

}
	}
}
