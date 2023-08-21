package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NietPages 
{
	WebDriver driver ;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement userid;
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;
	public WebElement userIDField()
	{
		return userid;
	}
	public WebElement passwordField()
	{
		return password;
	}
	@FindBy(xpath ="//button[@id='js-login-btn']")
	WebElement loginbtn;
	public WebElement loginButton()
	{
		return loginbtn;
	}
	public NietPages(WebDriver rDriver)
	{
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}

}
