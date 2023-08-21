package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages
{
	WebDriver driver;
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	WebElement searchdropdown;
	public WebElement searchDropDown()
	{
		return searchdropdown;
	}
	public AmazonPages(WebDriver rDriver)
	{
		this.driver= rDriver;
		PageFactory.initElements(rDriver,this);
	}

}
