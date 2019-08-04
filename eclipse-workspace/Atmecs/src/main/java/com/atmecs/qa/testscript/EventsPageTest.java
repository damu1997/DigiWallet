package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.EventsPageHelper;
import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;

public class EventsPageTest extends Base {
CommonUtils commutils=new CommonUtils();

@BeforeTest	
public void preSetUp(){
	openBrowser();
}



@Test	
public void ForwardandBackwardvalidateSlides() {
	//media	
WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
commutils.mouseOverElement(driver, media);
		
		
  //events
commutils.waitForElement(driver,MediaPageHelper.eventsgetProperty());
commutils.normalClick(driver, MediaPageHelper.eventsgetProperty());
			
	//get the list of slides
List<WebElement> list=commutils.getListOfWebElement(driver,EventsPageHelper.allheader());
System.out.println(list.size());
		
	//validating theSlides Forward
		for (int i = 0; i <=list.size() ; i++) {	
commutils.find(driver, EventsPageHelper.forwardslideBtn());
commutils.waitForElement(driver,EventsPageHelper.forwardslideBtn());
commutils.normalClick(driver, EventsPageHelper.forwardslideBtn());
}
commutils.verifyTrue(CommonUtils.isDisplayed(driver, EventsPageHelper.allheader()),"passed");
		
	//validating the Slides Backward
	for (int i = 0; i <=list.size() ; i++) {	
commutils.find(driver, EventsPageHelper.backwardslideBtn());
commutils.waitForElement(driver,EventsPageHelper.backwardslideBtn());
commutils.normalClick(driver, EventsPageHelper.backwardslideBtn());
}
commutils.verifyTrue(CommonUtils.isDisplayed(driver, EventsPageHelper.allheader()),"passed");				
}		
}
