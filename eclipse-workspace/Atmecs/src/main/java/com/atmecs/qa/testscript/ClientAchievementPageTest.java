package com.atmecs.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.helper.CSRPageHelper;
import com.atmecs.qa.helper.ClientAchievementPageHelper;
import com.atmecs.qa.helper.MediaPageHelper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtils;
import com.atmecs.qa.utils.LogReporter;

public class ClientAchievementPageTest extends Base{
	CommonUtils commutils=new CommonUtils();
	LogReporter logreport=new LogReporter();
	
	

	@BeforeTest	
public void preSetUp(){
		openBrowser();		
	}
		
	
@Test
public void validateHeaderContentCount() {

	//media	
WebElement media=commutils.find(driver,MediaPageHelper.MediagetProperty());	
commutils.mouseOverElement(driver, media);
   //client-ach
commutils.waitForElement(driver,MediaPageHelper.clientAchievementsgetProperty());
commutils.normalClick(driver, MediaPageHelper.clientAchievementsgetProperty());
	//storing all the header in list
List<WebElement>allheaderContent=commutils.getListOfWebElement(driver, CSRPageHelper.allHyperLinkgetProperty());
List listofContent=commutils.convertListFromWebElement(driver, allheaderContent);
//logreport.info("AddedIntoList-->"+listofContent.toString());
//logreport.info("WebElementList-->"+allheaderContent.toString());
commutils.verifyTrue( listofContent==allheaderContent, "passed");
		
}
	
@Test
public void validatingReadmore() throws InterruptedException {
	
//clicking on read more
List<WebElement> readMoreLink = driver.findElements(By.xpath("//p/a[contains(text(),'Read More')]"));
	
for(int i=1; i<=readMoreLink.size(); i++) {
		
	//if(commutils.waitForElement(driver, ClientAchievementPageHelper.allHeaderContentgetProperty().replace("[xxx]",))) {
commutils.normalClick(driver, ClientAchievementPageHelper.allHeaderContentgetProperty().replace('x','i'));
		//driver.findElement(By.xpath("(//p/a[contains(text(),'Read More')])["i"]")).click();}
		
	driver.navigate().back();
		
	}
	}
	

	
	//click on read more
		/*
		 * for(WebElement element: readMoreLinks) { System.out.println(element);
		 * if(commutils.waitForWebElement(driver, element)) { element.click(); }
		 * driver.navigate().back();
		 * 
		 * }

		 *
		 */
}


	


	
	
	
	
	
	
	

