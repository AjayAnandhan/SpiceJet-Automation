package com.spicejet.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spiceject.base.BaseClass;
import com.spicejet.pages.HomePage;

/*
* @auther Ajay A
* Time : 4:05:55 PM
* Date : Nov 2, 2023
* Project Name : SpiceJetProject
*/

public class TC01_NavigationToSpiceJetApp extends BaseClass {
	
	@BeforeTest
	public void setup() {
		testName = "TC_01_NavigationToSpiceJetApp";
		testDescription = "Navigating to the SpiceJet website";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}
	
	@Test
	public void TC_01_ValidatingTitle() throws Throwable{
		HomePage hp = new HomePage();
		String actualTitle = hp.titleValidation();
		if(assertCheck(actualTitle, readProperty("title"))) {
			reportStep("Validating SpiceJet Page Title - Pass", "Pass", testName, "Validating SpiceJet Page Title");
		}else {
			reportStep("Validating SpiceJet Page Title - Fail", "Fail", testName, "Validating SpiceJet Page Title");
		}
	}
	

}
