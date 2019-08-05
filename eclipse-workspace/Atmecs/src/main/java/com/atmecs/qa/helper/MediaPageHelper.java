package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class MediaPageHelper{



public static String MediagetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"Media");
return data;	
}
public static String NewsgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"News");
return data;
	
}
public static String allHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"AllPageTitle");
return data;	
}

public static String navigateBackToHome(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"NavigateBackHome");
return data;	
}	

public static String CSRgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"CSR");
return data;	
}
public static String csrgetProperty(){
String data="//a[contains(text(),'Our Joy of Giving – CSR')]";
return data;	
}
public static String eventsgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"Events");
return data;	
}
public static String clientAchievementsgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.ALL_NAVI_LOC),"Client-Ach");
return data;
	
}
public static void preConfigurationSetup(WebDriver driver,CommonUtils commutils) {
	
		//media
		WebElement Media= commutils.find(driver,MediaPageHelper.MediagetProperty());
		commutils.mouseOverElement(driver, Media);
	}
public static void navigateBackToHomeSetup(WebDriver driver,CommonUtils commutils) {
	
	//home
	commutils.waitForElement(driver,MediaPageHelper.navigateBackToHome());
	commutils.normalClick(driver, MediaPageHelper.navigateBackToHome());
}
public static void assertingHeader(WebDriver driver,CommonUtils commutils,String Xpath,String headerxpath) {
	
	commutils.waitForElement(driver,Xpath);
	commutils.normalClick(driver, Xpath);
	commutils.verifyTrue(CommonUtils.isDisplayed(driver, headerxpath),"passed");
}
	
}
