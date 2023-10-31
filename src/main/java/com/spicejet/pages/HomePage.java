/**
 * 
 */
package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spiceject.base.BaseClass;

/**
 * @auther Ajay A
 */
public class HomePage extends BaseClass{
	
	public 
	
	@FindBy(xpath = "//a[.='Signup']")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement logInBtn;
	
	@FindBy(xpath = "//div[text()='Email']")
	WebElement emailBtn;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement typeEmail;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement typePassword;
	
	@FindBy(xpath = "//div[text()='LOGIN']")
	WebElement innerLogInBtn;
	
	@FindBy(xpath = "(//input[@dir='auto'])[1]")
	WebElement fromLocation;
	
	@FindBy(xpath = "(//input[@data-focusable='true'])[2]")
	WebElement toLocation;
	
	@FindBy(xpath = "//div[text()='Departure Date']/following-sibling::div")
	WebElement departureDatePicker;
	
	@FindBy(xpath = "//div[text()='Return Date']/following-sibling::div")
	WebElement returnDatePicker;
	
	@FindBy(xpath = "(//div[@data-testid='undefined-calendar-day-31']//div)[3]")
	WebElement departureDate;
	
	@FindBy(xpath = "(//div[text()='31'])[3]")
	WebElement returnDate;
	
	@FindBy(xpath = "//div[text()='Search Flight']")
	WebElement searchFlight;
	
	@FindBy(xpath = "//div[text()='round trip']")
	WebElement roundTrip;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void gotoSignupPage() {
		clickOn(signUpBtn);
	}
	
	public void logInFunction() throws Exception {
		clickOn(logInBtn);
		clickOn(emailBtn);
		type(typeEmail, readProperty("email"));
		type(typePassword, readProperty("pasword"));
		clickOn(innerLogInBtn);
	}
	
	public void oneWayTrip() throws Exception {
		type(fromLocation, readProperty("fromLocation"));
		type(toLocation, readProperty("toLocation"));
		jsClickOn(departureDate);
		clickOn(searchFlight);
	}
	
	public void roundTrip() throws Exception {
		clickOn(roundTrip);
		type(fromLocation, readProperty("fromLocation"));
		type(toLocation, readProperty("toLocation"));
		jsClickOn(departureDate);
		jsClickOn(returnDate);
		clickOn(searchFlight);
	}

}
