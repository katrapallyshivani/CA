package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CRM_003 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://in.freecrm.com/");
	}
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("testaccount@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("TestPassword");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		String errormsg = driver.findElement(By.xpath("//div[contains(text(),'Something went wrong...')]")).getText();
		if(errormsg=="Something went wrong...")
		{
			System.out.println("Test Passed");
		}
		System.out.println(errormsg);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
