package com.atmecs.qa.testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;

public class MediaPageTest extends Base {
	
	CommonUtils commutils=new CommonUtils();
	WebElement Media;
	@BeforeTest
	public void preSetUp(){
		openBrowser();
		
			
	}
	


@Test(priority = 0)
public void testMediaPage() {
	
	//media
	Media= commutils.find(driver,MediaPageHelper.MediagetProperty());
	commutils.mouseOverElement(driver, Media);
	
	//news 
	commutils.waitForElement(driver, MediaPageHelper.NewsgetProperty());
	commutils.normalClick(driver, MediaPageHelper.NewsgetProperty());
	commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()),"passed");
	
	//click home
	commutils.waitForElement(driver, MediaPageHelper.navigateBackgetProperty());
	commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
	
	
	

	
}
@Test(priority = 1)
public void testcsr() {
	//media
	Media= commutils.find(driver,MediaPageHelper.MediagetProperty());
		commutils.mouseOverElement(driver, Media);
		
		//our CSR
		commutils.waitForElement(driver,MediaPageHelper.csrgetProperty());
		commutils.normalClick(driver, MediaPageHelper.csrgetProperty());
		commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()),"passed");
		
		//click home
		commutils.waitForElement(driver,MediaPageHelper.navigateBackgetProperty());
		commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
}
@Test(priority = 2)
public void testevents() {
	//media
	Media= commutils.find(driver,MediaPageHelper.MediagetProperty());
	commutils.mouseOverElement(driver, Media);
	
	
	//events
	commutils.waitForElement(driver,MediaPageHelper.eventsgetProperty());
	commutils.normalClick(driver, MediaPageHelper.eventsgetProperty());
	commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()),"passed");
	
	
	//click home
		commutils.waitForElement(driver,MediaPageHelper.navigateBackgetProperty());
		commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
		
}
@Test(priority = 3)
public void testclient() {
	
	//media
	Media= commutils.find(driver,MediaPageHelper.MediagetProperty());
		commutils.mouseOverElement(driver, Media);
	//clent-ach
		commutils.waitForElement(driver,MediaPageHelper.clientAchievementsgetProperty());
		commutils.normalClick(driver, MediaPageHelper.clientAchievementsgetProperty());
		commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()),"passed");
		
		//clickhome
		commutils.waitForElement(driver,MediaPageHelper.allHeadergetProperty());
		commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
			
}

}
