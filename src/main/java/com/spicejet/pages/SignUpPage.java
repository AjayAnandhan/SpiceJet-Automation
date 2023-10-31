/**
 * 
 */
package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.spiceject.base.BaseClass;

/**
 * @auther Ajay A
 */
public class SignUpPage extends BaseClass{
	
	@FindBy(xpath = "(//label[@class='font-14 bold']/following-sibling::select)[1]")
	WebElement titleDropDown;
	
	@FindBy (xpath = "(//label[text()='First Name and Middle Name']/following::input)[1]")
	WebElement firstName;
	
	@FindBy (xpath = "(//label[text()='Last Name']/following::input)[1]")
	WebElement lastName;
	
	@FindBy(xpath = "(//label[text()='Date of Birth']/following::input)[1]")
	WebElement dob;
	
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement month;
	
	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--003']")
	WebElement day;
	
	@FindBy(xpath = "(//label[text()='Mobile Number']/following::input)[1]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "(//label[text()='Email ID']/following::input)[1]")
	WebElement typeEmail;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement typePassword;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement typeConfirmPassword;
	
	@FindBy(xpath = "(//label[text()='Confirm Password']/following::input)[2]")
	WebElement clickCheckBox;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement submitButton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void signInFunction() throws Exception {
		Select sel = new Select(titleDropDown);
		sel.selectByVisibleText("Mr");
		type(firstName, readProperty("firstName"));
		type(lastName, readProperty("lastName"));
		clickOn(dob);
		clickOn(year);
		sel.selectByVisibleText("2000");
		clickOn(month);
		sel.selectByVisibleText("February");
		clickOn(day);
		type(mobileNumber, readProperty("MobileNumber"));
		type(typeEmail, readProperty("email"));
		type(typePassword, readProperty("password"));
		type(typeConfirmPassword, readProperty("password"));
		clickOn(clickCheckBox);
		clickOn(submitButton);
	}
	
}
