package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class ClientAchievementPageHelper {
	public static String allHeaderContentgetProperty(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),"AllHeaderContent");
		return data;		
	}
	
	public static String oneByoneHeaderContentgetProperty(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),"OneByOneHeader");
		return data;		
		}

	public static void preConfiguration(WebDriver driver,CommonUtils commutils) {
		//media	
		WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
		commutils.mouseOverElement(driver, media);
		   //client-ach
		commutils.waitForElement(driver,MediaPageHelper.clientAchievementsgetProperty());
		commutils.normalClick(driver, MediaPageHelper.clientAchievementsgetProperty());
	}
	
}
