package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPages 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement emailinput;
	public WebElement EmailField()
	{
		return emailinput;
	}
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement nextbtn;
	public WebElement nextButton()
	{
		return nextbtn;
	}
	@FindBy(xpath="//span[contains(text(),'Forgot password?')]")
	WebElement pwd;
	public WebElement passwordField()
	{
		return pwd;
	}
	public GmailPages(WebDriver rDriver)
	{
		this.driver=rDriver;
		PageFactory.initElements(rDriver,this);
	}
}
