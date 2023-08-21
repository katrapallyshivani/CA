package com.qa.testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_NIET_001 extends TestBase
{
	@Test
	public void login() throws InterruptedException
	{
		Assert.assertEquals(driver.getTitle(), "Login", "User is not on Niet ERP Page");
		System.out.println("User is not on Niet Homepage");
		String username = prop.getProperty("userid");
		String password = prop.getProperty("password");
		niet.userIDField().sendKeys(username);
		niet.passwordField().sendKeys(password);
		niet.loginButton().click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "DashBoard", "Login Unsuccessful");
		System.out.println("Login Sucessful");
	}

}
