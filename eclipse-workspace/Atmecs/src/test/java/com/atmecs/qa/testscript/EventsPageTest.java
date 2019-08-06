package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.EventsPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;

/**
 * This class will performs the validation of slides in forward and Backward
 * direction Assertion done with respect to the header content
 * 
 * @author Damodaran.Krishnan
 *
 */
public class EventsPageTest extends Base {
	CommonUtils commutils = new CommonUtils();

//@BeforeTest	
	public void preSetUp() {
		openBrowser();
	}

	@Test
	public void ForwardandBackwardvalidateSlides() {
		// navigating to news
		EventsPageHelper.preconfigurationsetup(driver, commutils);

		// get the list of slides
		List<WebElement> list = commutils.getListOfWebElement(driver, EventsPageHelper.allheader());

		// validating the Slides Forward direction
		for (int i = 0; i <= list.size(); i++) {
			commutils.find(driver, EventsPageHelper.forwardslideBtn());
			commutils.waitForElement(driver, EventsPageHelper.forwardslideBtn());
			commutils.normalClick(driver, EventsPageHelper.forwardslideBtn());
		}
		commutils.verifyTrue(CommonUtils.isDisplayed(driver, EventsPageHelper.allheader()), "passed");

		// validating the Slides Backward direction
		for (int i = 0; i <= list.size(); i++) {
			commutils.find(driver, EventsPageHelper.backwardslideBtn());
			commutils.waitForElement(driver, EventsPageHelper.backwardslideBtn());
			commutils.normalClick(driver, EventsPageHelper.backwardslideBtn());
		}
		commutils.verifyTrue(CommonUtils.isDisplayed(driver, EventsPageHelper.allheader()), "passed");
	}

}
