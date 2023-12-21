package com.spicejet.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spiceject.base.BaseClass;
import com.spicejet.pages.HomePage;

/*
* @auther Ajay A
* Time : 4:42:06 PM
* Date : Nov 2, 2023
* Project Name : SpiceJetProject
*/

public class TC02_ValidateNavigationButtons extends BaseClass{
	
	@BeforeTest
	public void setup() {
		testName = "TC_02_ValidateNaavigationButtons";
		testDescription = "Validating navigation buttons in the homepage";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}
	
	@Test(priority = 2)
	public void TC_02_ValidateNavigationButtons() throws Throwable {
		HomePage hp = new HomePage();
		String checkInText = hp.checkInValidation();
		if(assertCheck(checkInText, "Web Check-In")) {
			reportStep("Validating Check-In button - Pass", "Pass", testName, "Validating Check-In button");
		}else {
			reportStep("Validating Check-In button - Fail", "Fail", testName, "Validating Check-In button");
		}
		String statusText = hp.flightStausValidation();
		if(assertCheck(statusText, "Flight Status")) {
			reportStep("Validating Flight Status button - Pass", "Pass", testName, "Validating Flight Status button");
		}else {
			reportStep("Validating Flight Status button - Fail", "Fail", testName, "Validating Flight Status button");
		}
		String manageBookingText = hp.manageBookingsValidation();
		if(assertCheck(manageBookingText, "View / Manage Booking")) {
			reportStep("Validating Manage Booking button - Pass", "Pass", testName, "Validating Manage Booking button - Pass");
		}else {
			reportStep("Validating Manage Booking button - Fail", "Fail", testName, "Validating Manage Booking button - Pass");
		}
	}

}
