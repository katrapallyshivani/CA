package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages
{
	WebDriver driver;
	@FindBy(name="q")
	WebElement searchbar;
	public WebElement searchBar()
	{
		return searchbar;
	}
	public GooglePages(WebDriver rDriver)
	{
		this.driver=rDriver;
		PageFactory.initElements(rDriver , this);
	}
}
