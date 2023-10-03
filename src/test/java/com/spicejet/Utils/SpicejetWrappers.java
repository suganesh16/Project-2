package com.spicejet.Utils;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.spicejet.pages.BookingPage;
import com.spicejet.pages.FlightPage;
import com.spicejet.pages.LoginPage;
import com.spicejet.pages.PaymentPage;
import com.spicejet.pages.SignInpage;

public class SpicejetWrappers extends SeWrappers {

	
	SeWrappers se =new SeWrappers();
	
	public void launchSpiceject()
	{
		try
		{
			Reports.setTCDesc("Validating with correct credentials");
			String pageTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
			String actualTitle=se.getTitle();
			Assert.assertTrue(driver.getTitle().equals(pageTitle));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public void SignIn() {
		try
		{
			SignInpage SiPage=PageFactory.initElements(driver,SignInpage.class);
			
			
			SiPage.clickSiginIn();
			SiPage.switchWindows();
			SiPage.clickValue();
			SiPage.clickSelect();
			SiPage.EnterfirstName("k");
			SiPage.EnterlastName("karthik");
		//	SiPage.clickcalander();
		//	SiPage.clickselectmonth();
		//	SiPage.Month();
		//	SiPage.clickselectyear();
		//	SiPage.Year();
			SiPage.EnterPhone("9123456789");
			SiPage.EnterEmail("kdkarthik16@gmail.com");
			SiPage.EnterPassword("KDkarthik@16");
			SiPage.CnPassword("KDkarthik@16");
			SiPage.ClickAgree();
			SiPage.ClickSubmit();
			
			SiPage.switchWindows();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void Login() {
		try
		{
			LoginPage LpPage=PageFactory.initElements(driver,LoginPage.class);
			
			LpPage.clickLogin();
			LpPage.EnterNumber("9123456789");
			LpPage.EnterPassword("KDkarthik@16");
			LpPage.clickButtonLogin();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
    public void FlightSearch() {
	try
	{
		FlightPage FpPage=PageFactory.initElements(driver,FlightPage.class);
		Thread.sleep(2000);
		FpPage.clickClose();
		FpPage.EnterFrom();
		FpPage.FromAirport();
		FpPage.EnterTo();
		FpPage.clickAirport();
        FpPage.ClickCalender(); 
        Thread.sleep(2000);
 		FpPage.clickSearch();
 		Thread.sleep(5000);
  		FpPage.navigateBack();
  		FpPage.ClickRound();
  		FpPage.ClickSelectdate();
  		FpPage.ClickDate();
  		FpPage.ClickFlight();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
    public void Bookin() {
    	try
    	{
    		BookingPage Bp=PageFactory.initElements(driver,BookingPage.class);
    		Thread.sleep(5000);
    		Bp.navigateBack();
    		Bp.ClickOne();
    		Bp.ClickSearch();
    		Bp.ClickContinue();
    		Bp.EnterFName("Karthik");
    		Bp.EnterLName("karthik");
    		Bp.EnterNumber("9123456789");
    		Bp.EnterEmail("karthik16@gmail.com");
    		Bp.EnterCity("Coimbatore");
    		Bp.EnterNameFirst("karthik");
    		Bp.EnterNameLast("karthik");
    		//Bp.EnterNumber("9123456789");
    		Bp.ClickCon();
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
    public void Payment() {
    	try
    	{
    		PaymentPage Pp=PageFactory.initElements(driver,PaymentPage.class);
    		
    		Pp.ClickContinue();   		  		
    		Pp.ClickAlert(); 
    		Pp.ClickContinue();
    		//Pp.clickNext();
    		Pp.EnterCard("378282246310005");
    		Pp.EnterName("karthik");
    		Pp.EnterMonth("11");
    		Pp.EnterYear("23");
    		Pp.EnterCode("621");
    		Pp.Clickpayment();
    		
    		
    		Pp.closeAllBrowsers();
    		
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
