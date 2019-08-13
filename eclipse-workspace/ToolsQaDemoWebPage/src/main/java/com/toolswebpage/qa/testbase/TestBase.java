package com.toolswebpage.qa.testbase;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.toolswebpage.qa.constants.Constants;
import com.toolswebpage.qa.utils.PropertiesUtil;



public class TestBase {
	public static WebDriver driver;

	public static PropertiesUtil props=PropertiesUtil.getInstance();
	
		static String chromepath="C:\\Users\\Damodaran.Krishnan\\eclipse-workspace\\ToolsQaDemoWebPage\\lib\\chromedriver.exe";
		static	String firefoxpath=props.getValue("FirefoxDriverPath");
		static String internetexplorerpath=props.getValue("IEDriverPath");

	@BeforeTest
	public void openBrowser() 
	{ 

	if (props.getValue("browser").equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver = new ChromeDriver();
	} 
	else if (props.getValue("browser").equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver",firefoxpath);
		driver = new FirefoxDriver();
	}

	else if (props.getValue("browser").equalsIgnoreCase("internetexplorer")) 
	{
		System.setProperty("webdriver.ie.driver",internetexplorerpath);
		driver = new InternetExplorerDriver();
	}
	driver.get(props.getValue("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

	//@AfterTest
	public void quitBrowser()  {

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS); 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.quit();
	}
}
