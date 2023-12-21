/**
 * 
 */
package com.spicejet.pages;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//input[@id='dobDate']")
	WebElement dob;
	
	@FindBy(xpath = "//div[text()='2']")
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

	public String signInFunction(String fName, String lName, String mobileNumber, String email, String password, String confirmPassword, String xpath, String expMessage, String testCase) throws Exception {
		waitExplicit(titleDropDown);
		Select sel = new Select(titleDropDown);
		sel.selectByVisibleText("Mr");
		type(firstName, fName);
		type(lastName, lName);
		type(dob, readProperty("dob"));
		jsClickOn(day);
		Thread.sleep(2000);
		jsScrollUntillElement(this.mobileNumber);
		type(this.mobileNumber, mobileNumber);
		Thread.sleep(2000);
		jsScrollUntillElement(typeEmail);
		type(typeEmail, email);
		Thread.sleep(2000);
		jsScrollUntillElement(typeEmail);
		type(typeEmail, email);
		Thread.sleep(2000);
		jsScrollUntillElement(typePassword);
		type(typePassword, password);
		Thread.sleep(2000);
		jsScrollUntillElement(typePassword);
		type(typePassword, password);
		Thread.sleep(2000);
		jsScrollUntillElement(typeConfirmPassword);
		type(typeConfirmPassword, confirmPassword);
		Thread.sleep(2000);
		jsScrollUntillElement(clickCheckBox);
		clickOn(clickCheckBox);
		jsScrollUntillElement(submitButton);
		clickOn(submitButton);
		WebElement msg = driver.findElement(By.xpath(""+xpath+""));
		return extractText(msg);
	}
	
}
