package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class NewsPageHelper {

	public static String btngetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "WatchNowBtn");
		return data;
	}

	public static String NewsHeadergetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "WatchNowBtn");
		return data;
	}

	public static String singleBtngetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "singleBtn");
		return data;
	}

	public static String pdfTitlegetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "pdftitle");
		return data;
	}

	public static String AllReadMoreBtngetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "AllReadMoreBtn");
		return data;
	}

	public static String SingleReadMoreBtngetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.NEWS_LOC), "SingleReadMoreBtn");
		return data;
	}

	public static void PreConfigurationSetup(WebDriver driver, CommonUtils commutils) {
//media	
		WebElement media = commutils.find(driver, MediaPageHelper.MediagetProperty());
		commutils.mouseOverElement(driver, media);
//news
		commutils.waitForElement(driver, MediaPageHelper.NewsgetProperty());
		commutils.normalClick(driver, MediaPageHelper.NewsgetProperty());

	}

	public static void assertingWatchMoreBtn(WebDriver driver, CommonUtils commutils) {
//asserting WatchNow button
		commutils.waitForElement(driver, NewsPageHelper.btngetProperty());
		commutils.normalClick(driver, NewsPageHelper.btngetProperty());
		commutils.verifyTrue(CommonUtils.isDisplayed(driver, MediaPageHelper.allHeadergetProperty()), "passed");
	}
}
