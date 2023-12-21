package com.spicejet.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spiceject.base.BaseClass;
import com.spicejet.pages.HomePage;
import com.spicejet.pages.SignUpPage;

/*
* @auther Ajay A
* Time : 4:59:37 PM
* Date : Nov 3, 2023
* Project Name : SpiceJetProject
*/
 
public class TC03_ValidateSignUpPage extends BaseClass{
	
	@BeforeTest
	public void setup() {
		testName = "TC_03_CreateAccountFunction";
		testDescription = "SignUp with various test cases";
		testCategory = "Regression";
		testAuthor = "Ajay A";
		sheetName = "SignUpData";
	}
	
	@Test(dataProvider = "getFromExcel", priority = 3)
	public void TC_03_ValidateSignUpPage(String fName, String lName, String mobileNumber, String email, String password, String confirmPassword, String xpath, String expMessage, String testCase) throws Exception{
		String windowHandle = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;
		HomePage hp = new HomePage();
		hp.gotoSignupPage();
		for (String newWindow : driver.getWindowHandles()) {
		    if(!windowHandle.contentEquals(newWindow)) {
		        driver.switchTo().window(newWindow);
		        break;
		    }
		}
		SignUpPage sp = new SignUpPage();
		String actMessage = sp.signInFunction(fName, lName, mobileNumber, email, password, confirmPassword, xpath, expMessage, testCase);
		if(assertCheck(actMessage, expMessage)) {
			reportStep("Validating CreatAccount Functionality - Pass", "Pass", testName, testCase);
		}else {
			reportStep("Validating CreatAccount Functionality - Pass", "Pass", testName, testCase);
		}
	}
}
