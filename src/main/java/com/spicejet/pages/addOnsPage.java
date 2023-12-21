package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spiceject.base.BaseClass;

/*
* @auther Ajay A
* Time : 3:00:42 PM
* Date : Oct 31, 2023
* Project Name : SpiceJetProject
*/

public class addOnsPage extends BaseClass{
	
	@FindBy(xpath = "(//div[@data-testid='add-ons-continue-footer-button'])")
	WebElement continueButton1;
	
	@FindBy(xpath = "(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement continueButton2;
	
	@FindBy(xpath = "/html/body/div[6]/div/div[1]/img")
	WebElement closeButton;
	
	@FindBy(xpath = "//button[text()='Book Now']")
	WebElement bookNowButton;
	
	
	
	public addOnsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage clickOnContinue() throws InterruptedException {
		Thread.sleep(5000);
		if (continueButton1.isDisplayed()) {
			clickOn(continueButton1);
		}else if(continueButton2.isDisplayed()) { 
			clickOn(continueButton2);
		}else if (bookNowButton.isDisplayed()){
				clickOn(bookNowButton);
				if (continueButton1.isDisplayed()) {
					clickOn(continueButton1);
				}else if(continueButton2.isDisplayed()) { 
					clickOn(continueButton2);
				}
			}
		return null;
	}
}
