package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.ClientAchievementPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;

/**
 * This class will performs the validation of all the link Header content count
 * and asserting readMore Button one by one
 * 
 * @author Damodaran.Krishnan
 *
 */
public class ClientAchievementPageTest extends Base {
	static CommonUtils commutils = new CommonUtils();
	LogReporter logreport = new LogReporter();

	@Test
	public void validatingAllHeaderContentCount() {
		ClientAchievementPageHelper.preConfiguration(driver, commutils);
		List<WebElement> headerContent = commutils.getListOfWebElement(driver,
				ClientAchievementPageHelper.allHeaderContentgetProperty());
		List<String> listofheaderContent = commutils.convertListFromWebElement(driver, headerContent);
		commutils.verifyTrue(listofheaderContent.size() == headerContent.size(), "passed");
		logreport.info(listofheaderContent.toString());

	}

	@Test
	public void validatingAllReadmore() {

		List<WebElement> readMoreLink = commutils.getListOfWebElement(driver,
				ClientAchievementPageHelper.allHeaderContentgetProperty());

		for (int i = 1; i <= readMoreLink.size(); i++) {

			if (commutils.waitForElement(driver,
					ClientAchievementPageHelper.oneByoneHeaderContentgetProperty().replace("l", String.valueOf(i)))) {
				commutils.normalClick(driver,
						ClientAchievementPageHelper.oneByoneHeaderContentgetProperty().replace("l", String.valueOf(i)));
				if (i == 1) {
					System.out.println("1");
					commutils.verifyTrue(CommonUtils.isDisplayed(driver,
							ClientAchievementPageHelper.ConveyHealthHeaderImgGetProperty()), "passed");
				} else if (i == 2) {
					System.out.println("2");
					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.UsAutoHeaderImgGetProperty()),
							"passed");
				} else if (i == 3) {
					System.out.println("3");
					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.OnDotHeaderImgGetProperty()),
							"passed");

				} else if (i == 4) {
					System.out.println("4");
					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.PMCHeaderImgGetProperty()),
							"passed");

				} else if (i == 5) {
					System.out.println("5");
					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.JauntHeaderImgGetProperty()),
							"passed");

				} else if (i == 6) {
					System.out.println("6");

					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.HyperLoopTextGetProperty()),
							"passed");

				} else if (i == 7) {
					System.out.println("7");
					commutils.verifyTrue(
							CommonUtils.isDisplayed(driver, ClientAchievementPageHelper.JawBoneHeaderImgGetProperty()),
							"passed");

				}

			}

			driver.navigate().back();
		}

	}

}
