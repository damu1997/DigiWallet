package com.atmecs.qa.helper;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.PropertyUtil;

public class NewsPageHelper {


public static String btngetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"WatchNowBtn");
return data;		
}
public static String NewsHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"WatchNowBtn");
return data;
}
public static String singleBtngetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"singleBtn");
return data;	
}
public static String pdfTitlegetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"pdftitle");
return data;	
}
public static String AllReadMoreBtngetProperty(){
	String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"AllReadMoreBtn");
	return data;		
}

public static String SingleReadMoreBtngetProperty(){
	String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.NEWS_LOC),"SingleReadMoreBtn");
	return data;		
	}
}
