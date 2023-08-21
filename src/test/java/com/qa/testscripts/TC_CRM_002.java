package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CRM_002 
{
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://in.freecrm.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testaccount@gmail.com");
		driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-checkmark")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
		String err = driver.findElement(By.xpath("//li[contains(text(),'Please accept the terms to continue.')]")).getText();
		if(err == "Please accept the terms to continue.")
		{
			System.out.println(err);
		}
		driver.quit();
	}
}
