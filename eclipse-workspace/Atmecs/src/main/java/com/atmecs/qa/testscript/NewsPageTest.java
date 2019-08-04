package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.ClientAchievementPageHelper;
import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.helper.NewsPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;

public class NewsPageTest extends Base{
	CommonUtils commutils=new CommonUtils();
	LogReporter logreport=new LogReporter();

	@BeforeTest	
public void preSetUp(){
		openBrowser();
	}
	
	
	@Test(priority = 0)
	public void checkingWatchMoreFn() {
		
	//media	
	WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
	commutils.mouseOverElement(driver, media);
	//news
	commutils.waitForElement(driver, MediaPageHelper.NewsgetProperty());
	commutils.normalClick(driver, MediaPageHelper.NewsgetProperty());
	
	//WNbtnAndAssert
	commutils.waitForElement(driver, NewsPageHelper.btngetProperty());
	commutils.normalClick(driver, NewsPageHelper.btngetProperty());
	commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()),"passed");
	
	
	//backtohome
	commutils.waitForElement(driver,MediaPageHelper.allHeadergetProperty());
	commutils.normalClick(driver, MediaPageHelper.navigateBackgetProperty());
		
		
	}
	@Test(priority = 1)
	public void validatingAllReadMore() {
		//media	
		WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
		commutils.mouseOverElement(driver, media);
		//news
		commutils.waitForElement(driver, MediaPageHelper.NewsgetProperty());
		commutils.normalClick(driver, MediaPageHelper.NewsgetProperty());	
		//clicking on all the read more
		List<WebElement> readMoreLink = commutils.getListOfWebElement(driver,NewsPageHelper.AllReadMoreBtngetProperty());

		for(int i=1; i<=readMoreLink.size(); i++) {
			
			if(commutils.waitForElement(driver, NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)))); {
			commutils.normalClick(driver, NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)));
			//assertforallnewspdf
			commutils.verifyTrue(commutils.isDisplayed(driver, NewsPageHelper.pdfTitlegetProperty()), "passed");
			
	}
	}
	}

	
	
}	
	
	

