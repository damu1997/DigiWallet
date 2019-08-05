package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class CsrPageHelper extends Base{

 

public static String allHyperLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"AllHyperLink");
return data;		
}	
public static String davLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"DAVLink");
return data;		
}
public static String davHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"HeaderDAV");
return data;		
}	
public static String sjudeLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"SjudeLink");
return data;		
}
public static String sjudeHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"HeaderDAV");
return data;		
}	
public static String  scfLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"SCFLink");
return data;		
}
public static String scfHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"SCFHeader");
return data;		
}
public static String  ncfLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"NCFLink");
return data;		
}
public static String ncfHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"NCFHeader");
return data;		
}

public static String  hfhLinkgetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"HFHLink");
return data;		
}
public static String hfhHeadergetProperty(){
String data=PropertyUtil.readPropertyFile( PropertyUtil.loadProperty(Constants.CSR_LOC),"HFHHeaderImg");
return data;		
}
public static void preRequestNavigation(WebDriver driver,CommonUtils commutils) { 

	//media
WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
commutils.mouseOverElement(driver, media);
    //our CSR
commutils.waitForElement(driver,MediaPageHelper.csrgetProperty());
commutils.normalClick(driver, MediaPageHelper.csrgetProperty());	
}
public static void assertinglinkHeader(WebDriver driver,CommonUtils commutils,String Xpath,String Headerxpath) {
	//validating DAV link
	commutils.waitForElement(driver,Xpath);
	commutils.normalClick(driver, Xpath);
	commutils.verifyTrue(CommonUtils.isDisplayed(driver, Headerxpath),"passed");
	driver.navigate().back();
}
}
