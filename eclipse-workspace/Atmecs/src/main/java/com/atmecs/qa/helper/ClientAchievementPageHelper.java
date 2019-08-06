package com.atmecs.qa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.PropertyUtil;

public class ClientAchievementPageHelper {
	public static String allHeaderContentReadMoregetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"AllHeaderContentReadMore");
		return data;
	}

	public static String oneByoneHeaderContentgetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"OneByOneHeader");
		return data;
	}

	public static String allHeaderContentgetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"AllHeaderContent");
		return data;
	}

	public static String ConveyHealthHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"ConveyHealthHeaderImg");
		return data;
	}

	public static String UsAutoHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"UsAutoHeaderImg");
		return data;
	}

	public static String OnDotHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"OnDotHeaderImg");
		return data;
	}

	public static String PMCHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"PMCHeaderImg");
		return data;
	}

	public static String JauntHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"JauntHeaderImg");
		return data;
	}

	public static String HyperLoopTextGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"HyperLoopText");
		return data;
	}

	public static String JawBoneHeaderImgGetProperty() {
		String data = PropertyUtil.readPropertyFile(PropertyUtil.loadProperty(Constants.CLIENT_ACHIEVE_LOC),
				"JawBoneHeaderImg");
		return data;
	}

	public static void preConfiguration(WebDriver driver, CommonUtils commutils) {
		// media
		WebElement media = commutils.find(driver, MediaPageHelper.MediagetProperty());
		commutils.mouseOverElement(driver, media);
		// client-ach
		commutils.waitForElement(driver, MediaPageHelper.clientAchievementsgetProperty());
		commutils.normalClick(driver, MediaPageHelper.clientAchievementsgetProperty());
	}

}
