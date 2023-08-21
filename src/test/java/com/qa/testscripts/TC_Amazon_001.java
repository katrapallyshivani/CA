package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Amazon_001 extends TestBase 
{
	@Test
	public void checkSearchBar() throws InterruptedException
	{
		String title=driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title, "Error");
		System.out.println("Amazon HomePage");
		amazonOr.searchDropDown().click();
		Thread.sleep(5000);
	}

}
