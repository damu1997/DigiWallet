package com.atmecswebpage.mediapage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecswebpage.constants.ConstantData;
import com.atmecswebpage.utils.Configuration;

public class MediaPage extends ConstantData{

WebDriver driver;
Configuration cdata=new Configuration();
@BeforeMethod
public void initialiseBrowsers() {
System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH );
driver=new ChromeDriver();
driver.manage().window().maximize();
cdata.initialiseProperties();
}

@Test
public void NewsNavigation() {
driver.get(cdata.getApplicationUrl());
WebElement Media=driver.findElement(By.xpath(cdata.getMouseHover()));
Media.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement News=driver.findElement(By.xpath(cdata.getNews()));
News.click();
Assert.assertTrue(driver.findElement(By.xpath(cdata.getNewsHeaderContent())).isDisplayed(), "pass");	
}
public void CSRNavigation() {
driver.get(cdata.getApplicationUrl());
WebElement Media=driver.findElement(By.xpath(cdata.getMouseHover()));
Media.click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement CSR=driver.findElement(By.xpath(cdata.getCSR()));
CSR.click();
Assert.assertTrue(driver.findElement(By.xpath(cdata.getCSRHeaderContent())).isDisplayed(), "pass");				
}




@AfterMethod
public void quit() {
	
	driver.quit();
}



	
	
}
