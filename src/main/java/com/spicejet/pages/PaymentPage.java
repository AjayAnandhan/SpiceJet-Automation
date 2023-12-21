package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spiceject.base.BaseClass;

/*
* @auther Ajay A
* Time : 3:01:15 PM
* Date : Oct 31, 2023
* Project Name : SpiceJetProject
*/

public class PaymentPage extends BaseClass{
	
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id='name_on_card']")
	WebElement nameOnCard;
	
	@FindBy(xpath = "//input[@id='card_exp_month']")
	WebElement expMonth;
	
	@FindBy(xpath = "//input[@id='card_exp_year']")
	WebElement expYear;
	
	@FindBy(xpath = "//input[@id='security_code']")
	WebElement cvv;
	
	@FindBy(xpath = "//div[@data-testid='common-proceed-to-pay']")
	WebElement continueButton;
	
	@FindBy(xpath = "//div[text()='Payment Failure']")
	WebElement paymentMsg;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
		}
	
	public TicketConfirmationPage paymentInfo() throws Exception{
		driver.switchTo().frame(1);
		type(cardNumber, readProperty("cardNumber"));
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		type(nameOnCard, readProperty("name"));
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		type(expMonth, readProperty("expMonth"));
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(4);
		type(expYear, readProperty("expYear"));
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(5);
		type(cvv, readProperty("cvv"));
		driver.switchTo().defaultContent();
		
		clickOn(continueButton);
		
		return null;
	}
	
}
