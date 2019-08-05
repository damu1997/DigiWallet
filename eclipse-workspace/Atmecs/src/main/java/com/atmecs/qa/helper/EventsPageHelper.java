package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class EventsPageHelper {

	
	public static String forwardslideBtn(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.EVENTS_LOC),"Forwardslide");
		return data;		
		}	
	public static String allheader(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.EVENTS_LOC),"allheaderSlide");
		return data;		
		}	
	public static String Singleheader(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.EVENTS_LOC),"headerSlide");
		return data;		
		}
	
	public static String backwardslideBtn(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.EVENTS_LOC),"BackwardSlide");
		return data;		
		}
public static void preconfigurationsetup(WebDriver driver,CommonUtils commutils) {
	
	//media	
WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
commutils.mouseOverElement(driver, media);		
  //events
commutils.waitForElement(driver,MediaPageHelper.eventsgetProperty());
commutils.normalClick(driver, MediaPageHelper.eventsgetProperty());
}
}