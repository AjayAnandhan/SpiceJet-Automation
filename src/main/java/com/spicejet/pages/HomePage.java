/**
 * 
 */
package com.spicejet.pages;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement typeMobileNumber;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement typePassword;
	
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement innerLogInBtn;
	
	@FindBy(xpath = "(//input[@dir='auto'])[1]")
	WebElement fromLocation;
	
	@FindBy(xpath = "(//input[@data-focusable='true'])[2]")
	WebElement toLocation;
	
	@FindBy(xpath = "//div[text()='Departure Date']/following-sibling::div")
	WebElement departureDatePicker;
	
	@FindBy(xpath = "//div[text()='Return Date']/following-sibling::div")
	WebElement returnDatePicker;
	
	@FindBy(xpath = "(//div[text()='31'])[1]")
	WebElement departureDate;
	
	@FindBy(xpath = "(//div[text()='31'])[3]")
	WebElement returnDate;
	
	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchFlight;
	
	@FindBy(xpath = "//div[text()='round trip']")
	WebElement roundTrip;
	
	@FindBy(xpath = "//div[@data-testid='check-in-horizontal-nav-tabs']")
	WebElement checkInBtn;
	
	@FindBy(xpath = "//div[text()='Web Check-In']")
	WebElement verfyCheckInText;
	
	@FindBy(xpath = "//div[@data-testid='flight status-horizontal-nav-tabs']")
	WebElement flightStatusBtn;
	
	@FindBy(xpath = "//div[text()='Flight Status']")
	WebElement verifyFlightStatusText;
	
	@FindBy(xpath = "//div[@data-testid='manage booking-horizontal-nav-tabs']")
	WebElement manageBookingButton;
	
	@FindBy(xpath = "//div[text()='View / Manage Booking']")
	WebElement verifyManageBookingText;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignUpPage gotoSignupPage() {
		clickOn(signUpBtn);
		return null;
	}
	
	public String titleValidation() throws Throwable{
		String titleText = getPageTitle();
		return titleText;
	}
	
	public String checkInValidation() throws Throwable{
		clickOn(checkInBtn);
		return extractText(verfyCheckInText);
		
	}
	
	public String flightStausValidation() throws Exception{
		clickOn(flightStatusBtn);
		return extractText(verifyFlightStatusText);
		
	}
	
	public String manageBookingsValidation() throws Exception{
		clickOn(manageBookingButton);
		return extractText(verifyManageBookingText);
	}
	
	public String logInFunction(String mobileNumber, String password, String xpath, String expResult,String testcase) throws InterruptedException  {
		clickOn(logInBtn);
		type(typeMobileNumber, mobileNumber);
		type(typePassword, password);
		Thread.sleep(2000);
		clickOn(innerLogInBtn);
		//jsClickOn(innerLogInBtn);
		WebElement msg = driver.findElement(By.xpath(""+xpath+""));
		return extractText(msg);
	}
	
	public FlightChoosingPage oneWayTrip() throws Exception {
		type(fromLocation, readProperty("fromLocation"));
		type(toLocation, readProperty("toLocation"));
		clickOn(departureDate);
		clickOn(searchFlight);
		return null;
	}
	
	public FlightChoosingPage roundTrip() throws Exception {
		clickOn(roundTrip);
		type(fromLocation, readProperty("fromLocation"));
		type(toLocation, readProperty("toLocation"));
		clickOn(departureDate);
		clickOn(returnDate);
		clickOn(searchFlight);
		return null;
	}
	
}
