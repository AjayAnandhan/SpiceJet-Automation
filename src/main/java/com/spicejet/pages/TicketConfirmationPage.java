package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiceject.base.BaseClass;

/*
* @auther Ajay A
* Time : 3:01:59 PM
* Date : Oct 31, 2023
* Project Name : SpiceJetProject
*/

public class TicketConfirmationPage extends BaseClass{
	
	@FindBy(xpath = "//div[text()='Payment Failure']")
	WebElement failureMessage;
	
	@FindBy(xpath = "//div[text()='Payment Successfull']")
	WebElement successMessage;
	
	public String validateMessage() {
		try {
			String msg = extractText(failureMessage);
			return msg;
		}catch(Exception e) {
			String msg = extractText(successMessage);
			return msg;
		}
	}
	
}

