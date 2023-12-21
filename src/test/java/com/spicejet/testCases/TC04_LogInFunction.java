package com.spicejet.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spiceject.base.BaseClass;
import com.spicejet.pages.HomePage;

/*
* @auther Ajay A
* Time : 4:48:34 PM
* Date : Nov 2, 2023
* Project Name : SpiceJetProject
*/

public class TC04_LogInFunction extends BaseClass{
	
	@BeforeTest
	public void setup() {
		testName = "TC_01_LogInFunction";
		testDescription = "LogIn with various test cases";
		testCategory = "Regression";
		testAuthor = "Ajay A";
		sheetName = "LogInData";
	}
	
	@Test(dataProvider="getFromExcel",priority=4)
	public void TC_04_LogInFuction(String firstName, String lastName, String xpath, String expMessage, String testCase) throws Exception{
		HomePage hp = new HomePage();
		String actMessage = hp.logInFunction(firstName, lastName, xpath, expMessage, testCase);
		if(assertCheck(actMessage, expMessage)) {
			reportStep("Validating Login function - Pass", "Pass", testName, testCase);
		}else {
			reportStep("Validating Login function - Fail", "Fail", testName, testCase);
		}
	}
	
}
