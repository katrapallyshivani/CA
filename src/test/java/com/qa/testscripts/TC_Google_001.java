package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Google_001 extends TestBase
{
	@Test
	public void searchPage() throws InterruptedException
	{
		String title = "Google";
		Assert.assertEquals(driver.getTitle(), title, "USer is not on Google Page");
		System.out.println("User is on Google Home Page");
		GoogleOR.searchBar().sendKeys("Alpha");
		Thread.sleep(5000);
	}
	
}
