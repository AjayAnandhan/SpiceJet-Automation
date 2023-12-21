/**
 * 
 */
package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spiceject.base.BaseClass;

/*
* @auther Ajay A
* Time : 2:57:12 PM
* Date : Oct 31, 2023
* Project Name : SpiceJetProject
*/
/**
 * 
 */
public class FlightChoosingPage extends BaseClass{
	
	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement continueBtn;
	
	public FlightChoosingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PassengersDetailsPage clickOnContinue() {
		clickOn(continueBtn);
		return null;
	}

}