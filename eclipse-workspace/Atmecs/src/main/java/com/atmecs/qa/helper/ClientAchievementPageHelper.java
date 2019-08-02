package com.atmecs.qa.helper;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.PropertyUtil;

public class ClientAchievementPageHelper {
	public static String allHeaderContentgetProperty(){
		String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),"AllHeaderContent");
		return data;		
		}
}
