package com.atmecs.qa.helper;

import java.util.Properties;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.testbase.Base;
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

public static String navigateBackgetProperty(){
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

	
}
