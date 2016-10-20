package com.project.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MacyTest {
	@Test
	public void testgoogle() throws InterruptedException{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www1.macys.com/");
		driver.findElement(By.xpath("//a[@id='closeButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("Jeans");
		
		driver.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();
		System.out.println("current title"+driver.getTitle());
		System.out.println("current url"+driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.xpath( "//img[@ id='image_2351352_0_cat'] ")).click();
		driver.findElement(By.xpath( "//li[@title='8S']")).click();
		driver.findElement( By.xpath( "//button[@ id='addToBagButton2351352']")).click();
		driver.findElement(By.xpath("//img[@ id='btnCheckout']")).click();
		driver.findElement( By.xpath("//div[@ id='remove_item_31513969_3_1']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Removed from bag']")).getText());
		Thread.sleep(5000);
		driver.close();

}
}
