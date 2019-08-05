package com.atmecs.qa.testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
/**
 * This class will performs the validation of all the Navigation 
 * of Media's sub content
 * @author Damodaran.Krishnan
 *
 */
public class MediaPageTest extends Base {
	
	CommonUtils commutils=new CommonUtils();
	WebElement Media;
	@BeforeTest
	public void preSetUp(){
		openBrowser();
		
			
	}
	


	/*
	 * @Test(priority = 0) public void navigatingToNewsValidation() { //MouseOver to
	 * media MediaPageHelper.preConfigurationSetup(driver, commutils);
	 * 
	 * //Asserting news header MediaPageHelper.assertingHeader(driver, commutils,
	 * MediaPageHelper.NewsgetProperty(), MediaPageHelper.allHeadergetProperty());
	 * 
	 * //click home MediaPageHelper.navigateBackToHomeSetup(driver, commutils); }
	 * 
	 * @Test(priority = 1) public void navigatingToCSRValidation() { //MouseOverto
	 * media MediaPageHelper.preConfigurationSetup(driver, commutils);
	 * 
	 * //Asserting CSR header MediaPageHelper.assertingHeader(driver, commutils,
	 * MediaPageHelper.csrgetProperty(), MediaPageHelper.allHeadergetProperty());
	 * 
	 * //NavigateBackToHome MediaPageHelper.navigateBackToHomeSetup(driver,
	 * commutils); }
	 * 
	 * @Test(priority = 2) public void navigatingToEventsValidation() {
	 * 
	 * //MouseOverto media MediaPageHelper.preConfigurationSetup(driver, commutils);
	 * 
	 * //Asserting Events header MediaPageHelper.assertingHeader(driver, commutils,
	 * MediaPageHelper.eventsgetProperty(), MediaPageHelper.allHeadergetProperty());
	 * 
	 * //NavigateBackToHome MediaPageHelper.navigateBackToHomeSetup(driver,
	 * commutils); }
	 * 
	 * @Test(priority = 3) public void navigatingToClientAchievementsValidation() {
	 * //MouseOverto media MediaPageHelper.preConfigurationSetup(driver, commutils);
	 * 
	 * //Asserting clientAchievements header MediaPageHelper.assertingHeader(driver,
	 * commutils, MediaPageHelper.clientAchievementsgetProperty(),
	 * MediaPageHelper.allHeadergetProperty());
	 * 
	 * //NavigateBackToHome MediaPageHelper.navigateBackToHomeSetup(driver,
	 * commutils); }
	 */
@Test
public void AllNavigationUnderMedia() {
	
	
	
	for (int i = 0; i < 4; i++) {
		if(i==0) {
		MediaPageHelper.preConfigurationSetup(driver, commutils);	
		MediaPageHelper.assertingHeader(driver, commutils,MediaPageHelper.NewsgetProperty(), MediaPageHelper.allHeadergetProperty());
	    MediaPageHelper.navigateBackToHomeSetup(driver, commutils);}
		else if(i==1){
		MediaPageHelper.preConfigurationSetup(driver, commutils);
		MediaPageHelper.assertingHeader(driver, commutils,MediaPageHelper.csrgetProperty(), MediaPageHelper.allHeadergetProperty());
	    MediaPageHelper.navigateBackToHomeSetup(driver,commutils); 		 
		}
		else if(i==2) {
		MediaPageHelper.preConfigurationSetup(driver, commutils);
		MediaPageHelper.assertingHeader(driver, commutils, MediaPageHelper.eventsgetProperty(), MediaPageHelper.allHeadergetProperty());
		MediaPageHelper.navigateBackToHomeSetup(driver,commutils); 
        }
		else if(i==3) {
			
		MediaPageHelper.preConfigurationSetup(driver, commutils);
        MediaPageHelper.assertingHeader(driver,commutils, MediaPageHelper.clientAchievementsgetProperty(), MediaPageHelper.allHeadergetProperty());
		MediaPageHelper.navigateBackToHomeSetup(driver,commutils); 
        }
		else if(i==4) {
		MediaPageHelper.preConfigurationSetup(driver, commutils);
		MediaPageHelper.assertingHeader(driver, commutils, MediaPageHelper.clientAchievementsgetProperty(),MediaPageHelper.allHeadergetProperty());
		MediaPageHelper.navigateBackToHomeSetup(driver,commutils); 
		}
			 	
}	
}
}
