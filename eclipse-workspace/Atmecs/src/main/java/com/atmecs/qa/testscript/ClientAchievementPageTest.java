package com.atmecs.qa.testscript;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.CsrPageHelper;
import com.atmecs.qa.helper.ClientAchievementPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;
/**
 * This class will performs the validation of all the link Header content count and 
 * readMore Button
 * @author Damodaran.Krishnan
 *
 */
public class ClientAchievementPageTest extends Base{
	static CommonUtils commutils=new CommonUtils();
	LogReporter logreport=new LogReporter();

	

	@BeforeTest	
public void preSetUp(){
		openBrowser();		
	}
		
	
@Test
public void validateLinkHeaderContentCount() {


ClientAchievementPageHelper.preConfiguration(driver, commutils);	
	
	
//storing all the header in list
List<WebElement>allheaderContent=commutils.getListOfWebElement(driver, CsrPageHelper.allHyperLinkgetProperty());
List<String>listofContent=commutils.convertListFromWebElement(driver, allheaderContent);

//asserting with size 
commutils.verifyTrue( listofContent.size()==allheaderContent.size(), "passed");
logreport.info("AddedIntoList-->"+listofContent.toString());
		
}
	
@Test
public void validatingReadmore()  {

//clicking on all the read more
	List<WebElement> readMoreLink = commutils.getListOfWebElement(driver,ClientAchievementPageHelper.allHeaderContentgetProperty());

	for(int i=1; i<=readMoreLink.size(); i++) {
		
		if(commutils.waitForElement(driver, ClientAchievementPageHelper.oneByoneHeaderContentgetProperty().replace("l", String.valueOf(i)))); {
		commutils.normalClick(driver, ClientAchievementPageHelper.oneByoneHeaderContentgetProperty().replace("l", String.valueOf(i)));
		driver.navigate().back();
		
}
}	
}
}




	


	
	
	
	
	
	
	

