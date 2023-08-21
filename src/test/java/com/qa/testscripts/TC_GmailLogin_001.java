package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GmailLogin_001 extends TestBase
{
	@Test
	public void GmailLogin() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), "Gmail", "User is not on Gmail Page");
		System.out.println("User is on Gmail Page ");
		GmailOR.EmailField().sendKeys(prop.getProperty("email"));
		Thread.sleep(2000);
		GmailOR.nextButton().click();
		GmailOR.passwordField().sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		GmailOR.nextButton().click();
		Thread.sleep(10000);
	}

}
