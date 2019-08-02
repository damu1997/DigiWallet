package com.atmecs.qa.testscript;

import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.CSRPageHelper;
import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;

public class CSRpageTest extends Base{
  
	CommonUtils commutils=new CommonUtils();
	LogReporter logreport =new LogReporter();
	@BeforeTest
	public void preSetUp(){
		openBrowser();
}	
	
@Test(priority = 0)
public void validateAllHyperLinkCount() {
	
	//media	
WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
commutils.mouseOverElement(driver, media);
    //our CSR
commutils.waitForElement(driver,MediaPageHelper.csrgetProperty());
commutils.normalClick(driver, MediaPageHelper.csrgetProperty());	
	
	//getting all the link in list
List<WebElement>allhyperlink=commutils.getListOfWebElement(driver, CSRPageHelper.allHyperLinkgetProperty());
List listoflink=commutils.convertListFromWebElement(driver, allhyperlink);
logreport.info("AddedIntoList-->"+listoflink.toString());
logreport.info("WebElementList-->"+allhyperlink.toString());
commutils.verifyTrue( allhyperlink==listoflink, "passed");
//navigateback to home
commutils.waitForElement(driver,MediaPageHelper.navigateBackgetProperty());
commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
}
@Test(priority = 1)
public void checkingdavLink() {

CSRPageHelper.preRequestNavigation();
	
//davlink
commutils.waitForElement(driver,CSRPageHelper.davLinkgetProperty());

commutils.newtab(driver,  CSRPageHelper.davLinkgetProperty());

commutils.verifyTrue(CommonUtils.isDisplayed(driver, CSRPageHelper.davHeadergetProperty()),"passed");
	
}
@Test(priority = 2)
public void checkingsjudeLink() {

CSRPageHelper.preRequestNavigation();
	
//sjudelink
commutils.waitForElement(driver,CSRPageHelper.sjudeLinkgetProperty());

commutils.newtab(driver,  CSRPageHelper.sjudeLinkgetProperty());
commutils.verifyTrue(CommonUtils.isDisplayed(driver, CSRPageHelper.sjudeHeadergetProperty()),"passed");

	
}
@Test(priority = 3)
public void checkingSCFLink() {

CSRPageHelper.preRequestNavigation();
	
//scflink
commutils.waitForElement(driver,CSRPageHelper.scfLinkgetProperty());
commutils.newtab(driver,  CSRPageHelper.scfLinkgetProperty());
commutils.verifyTrue(CommonUtils.isDisplayed(driver, CSRPageHelper.scfHeadergetProperty()),"passed");

	
}
@Test(priority = 4)
public void checkingNCFLink() {

CSRPageHelper.preRequestNavigation();
	
//scflink
commutils.waitForElement(driver,CSRPageHelper.ncfLinkgetProperty());
commutils.newtab(driver,  CSRPageHelper.ncfLinkgetProperty());
commutils.verifyTrue(CommonUtils.isDisplayed(driver, CSRPageHelper.ncfHeadergetProperty()),"passed");

	
}
@Test(priority = 5)
public void checkingHFHLink() {

CSRPageHelper.preRequestNavigation();
	
//hfhlink
commutils.waitForElement(driver,CSRPageHelper.hfhLinkgetProperty());
commutils.newtab(driver,  CSRPageHelper.hfhLinkgetProperty());
commutils.verifyTrue(CommonUtils.isDisplayed(driver, CSRPageHelper.hfhHeadergetProperty()),"passed");

	
}
	
	
	
}
