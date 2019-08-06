package com.atmecs.qa.testscript;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
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
	
	


	
@Test
public void AllNavigationUnderMedia() {
	
	
	
	for (int i = 0; i < 4; i++) {
		if(i==0) {
		MediaPageHelper.preConfigurationSetup(driver, commutils);	
		MediaPageHelper.assertingHeader(driver, commutils,MediaPageHelper.NewsgetProperty(), MediaPageHelper.allHeadergetProperty());
	    MediaPageHelper.navigateBackToHomeSetup(driver, commutils);
	    }
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

