package com.qa.testscripts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;
import com.qa.pages.GmailPages;
import com.qa.pages.GooglePages;
import com.qa.pages.NietPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	WebDriver driver;
	GooglePages GoogleOR;
	GmailPages GmailOR;
	AmazonPages amazonOr;
	NietPages niet;
	FileInputStream fis;
	Properties prop;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser , String Url) throws IOException, InterruptedException
	{
		fis = new FileInputStream("C:\\Users\\Kumar Harsh\\eclipse-workspace\\TestAutomation.Practise\\src\\test\\java\\com\\qa\\utility\\info.properties");
		prop = new Properties();
		prop.load(fis);
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get(Url);
		Thread.sleep(1000);
		GoogleOR = new GooglePages(driver);
		GmailOR = new GmailPages(driver);
		amazonOr = new AmazonPages(driver);
		niet = new NietPages(driver);
	}	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	public void captureScreenshot(WebDriver driver , String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/Screenshots/" +tname+ ".png");
		FileUtils.copyFile(Source, target);
		
	}
}
