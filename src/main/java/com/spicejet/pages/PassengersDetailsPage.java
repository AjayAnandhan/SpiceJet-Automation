package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spiceject.base.BaseClass;

/*
* @auther Ajay A
* Time : 2:58:37 PM
* Date : Oct 31, 2023
* Project Name : SpiceJetProject
*/

public class PassengersDetailsPage extends BaseClass{
	
	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;
	
	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;
	
	@FindBy(xpath = "//div[text()='I am flying as the primary passenger']")
	WebElement checkBox;
	
	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement continueButton;
	
	public PassengersDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public addOnsPage PassengerDetails() throws Exception{
		type(this.firstName, "Ajay");
		type(this.lastName, "a");
		type(this.mobileNumber, "9876543210");
		type(this.email, "shgeroiguh@idrgh.com");
		type(this.city, readProperty("city"));
		clickOn(checkBox);
		clickOn(continueButton);
		return null;
	}

}