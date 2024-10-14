package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverUtility extends BaseClass {
public void verifyTitle(String expectedTitle) {
	
	String actualTitle = driver.getTitle();
	boolean res = actualTitle.contains(expectedTitle);
	Assert.assertTrue(res,"The title is not matching");
	Reporter.log(actualTitle+" page is displayed",true);
}
}
