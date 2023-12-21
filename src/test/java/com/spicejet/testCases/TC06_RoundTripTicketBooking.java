package com.spicejet.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spiceject.base.BaseClass;
import com.spicejet.pages.FlightChoosingPage;
import com.spicejet.pages.HomePage;
import com.spicejet.pages.PassengersDetailsPage;
import com.spicejet.pages.PaymentPage;
import com.spicejet.pages.TicketConfirmationPage;

/*
* @auther Ajay A
* Time : 9:04:06 PM
* Date : Nov 4, 2023
* Project Name : SpiceJetProject
*/

public class TC06_RoundTripTicketBooking extends BaseClass{
	
	@BeforeTest
	public void setup() {
		testName = "TC_06_BookOneWayTicket";
		testDescription = "User should be able to book round trip ticket";
		testCategory = "Regression";
		testAuthor = "Ajay A";
	}
	
	@Test
	public void TC_06_BookOneWayTicket() throws Throwable {
		HomePage hp = new HomePage();
		hp.roundTrip();;
		FlightChoosingPage fp = new FlightChoosingPage();
		fp.clickOnContinue();
		PassengersDetailsPage pp = new PassengersDetailsPage();
		pp.PassengerDetails();
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.paymentInfo();
		TicketConfirmationPage tp = new TicketConfirmationPage();
		String actMessage = tp.validateMessage();
		if(assertCheck(actMessage, "Ticket booking is successfull")) {
			reportStep("Validate whether the round trip ticket booking is successfull or not - Pass", "Pass", testName, "User can be able to book round trip ticket");
		}else if(assertCheck(actMessage, "Payment Failure")){
			reportStep("Validate whether the round trip ticket booking is successfull or not - Pass", "Pass", testName, "User can be able to book round trip ticket, But the credit card number is not valid");
		}else {
			reportStep("Validate whether the round trip ticket booking is successfull or not - Fail", "Fail", testName, "User not able to book round trip ticket");
		}
	}
}







