package com.atmecs.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.atmecs.qa.testbase.Base;

public class CommonUtils  extends Base{
	
	
	
	public WebElement find(WebDriver driver,String Xpath)  {
		WebElement Name=driver.findElement(By.xpath(Xpath));
		return Name;
	}
	
	
public void  clickOperation(WebDriver driver,WebElement Name,String Xpath)  {
	
		Name=find(driver, Xpath);
		Name.click();
		}
	
public boolean verifyTrue(boolean condition, String message) {
	boolean result = true;
	try {
		Assert.assertTrue(condition);
		
		result = true;
	} catch (AssertionError assertionError) {

		result = false;
	}
	return result;

}
public static boolean isDisplayed(WebDriver driver, String XPathIsDisplayed ) {
	boolean isDisplayed = false;
	try {
		isDisplayed = driver.findElement(By.xpath(XPathIsDisplayed)).isDisplayed();
	}catch(Exception e) {
		isDisplayed = false;
	}
	return isDisplayed;
}

public void forAssertfind(WebDriver driver,String Xpath)  {
	driver.findElement(By.xpath(Xpath));

}

public void mouseOverElement(WebDriver driver,WebElement Name) {
	Actions action=new Actions(driver);
	action.moveToElement(Name).perform();
}

public void normalClick(WebDriver driver,String Xpath) {
	find(driver, Xpath).click();
	
}
public boolean waitForElement(WebDriver driver,String value) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	}
	catch(Exception e) {
		return false;
	}
	return true;
}

public boolean waitForWebElement(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	try {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	catch(Exception e) {
		return false;
	}
	return true;
}
public List<WebElement> getListOfWebElement(WebDriver  driver,String Xpath){
	 List<WebElement> list = driver.findElements(By.xpath(Xpath));
	 return list;
}

public List<String> convertListFromWebElement(WebDriver driver, List<WebElement> list){
	List<String> textList = new ArrayList<String>();
	if(list.size()>0) {
		for(WebElement element:list) {
			textList.add(element.getText());
		}
	}
	return textList;
}
public void newtab(WebDriver driver,String xpath) {

	driver.findElement(By.xpath(xpath)).sendKeys( Keys.chord(Keys.LEFT_CONTROL,Keys.RETURN));
}


}

