package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.NewsPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;
/**
 * This class will performs the validation of watchMore button 
 * and all the ReadMore button 
 * Assertion done with respect to the header content 
 * @author Damodaran.Krishnan
 *
 */
public class NewsPageTest extends Base{
	CommonUtils commutils=new CommonUtils();
	LogReporter logreport=new LogReporter();

	@BeforeTest	
public void preSetUp(){
		openBrowser();
		//Navigate to news	
		NewsPageHelper.PreConfigurationSetup(driver, commutils);
	}
	
	
	@Test(priority = 0)
public void validatingWatchMoreBtn() {

//Asserting the header content
NewsPageHelper.assertingWatchMoreBtn(driver, commutils);
	
}
	
@Test(priority = 1)	
public void validatingAllReadMore() {
				
//Getting the webelement into list
List<WebElement> readMoreLink = commutils.getListOfWebElement(driver,NewsPageHelper.AllReadMoreBtngetProperty());
for(int i=1; i<=readMoreLink.size(); i++) {
			
  if(commutils.waitForElement(driver, NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)))); {
  commutils.normalClick(driver, NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)));

//asserting with PDF header
  commutils.verifyTrue(CommonUtils.isDisplayed(driver, NewsPageHelper.pdfTitlegetProperty()), "passed");
			
}
}
}

	
	
}	
	
	

