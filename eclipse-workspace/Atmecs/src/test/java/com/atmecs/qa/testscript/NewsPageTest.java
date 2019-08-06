package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.NewsPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;

/**
 * This class will performs the validation of watchMore button and all the
 * ReadMore button Assertion done with respect to the header content
 * 
 * @author Damodaran.Krishnan
 *
 */
public class NewsPageTest extends Base {
	CommonUtils commutils = new CommonUtils();
	LogReporter logreport = new LogReporter();


	@Test(priority = 0)
	public void validatingWatchMoreBtn() {

//Asserting the header content
		NewsPageHelper.PreConfigurationSetup(driver, commutils);
		NewsPageHelper.assertingWatchMoreBtn(driver, commutils);

	}

	@Test(priority = 1)
	public void validatingAllReadMore() {

		NewsPageHelper.PreConfigurationSetup(driver, commutils);

//Getting the web element into list
		List<WebElement> readMoreLink = commutils.getListOfWebElement(driver,
				NewsPageHelper.AllReadMoreBtngetProperty());
		logreport.info(String.valueOf(readMoreLink.size()));
		for (int i = 1; i <= readMoreLink.size(); i++) {

			if (commutils.waitForElement(driver,
					NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)))) {
				commutils.normalClick(driver,
						NewsPageHelper.SingleReadMoreBtngetProperty().replace("l", String.valueOf(i)));

			}
		}
	}

	
}
