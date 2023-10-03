package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.Utils.SeWrappers;

public class FlightPage extends SeWrappers{
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'][1]")
	WebElement close;
		
	@FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement From;
	
	@FindBy(xpath="//div[text()='Chennai International Airport']")
	WebElement Flocation;
	
	@FindBy(xpath="//input[@value='Select Destination']")
	WebElement To;
	
	@FindBy(xpath="//div[text()='Indira Gandhi International Airport']")
	WebElement Toairport;
		
	@FindBy(xpath="//div[text()='7']")
	WebElement Closecal;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
		
	@FindBy(xpath="//div[text()='round trip']")
	WebElement Round;
	
	@FindBy(xpath="//div[text()='Return Date']")
	WebElement SeltDate;
	
	@FindBy(xpath="//div[text()='7']")
	WebElement Sdate;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement Searchflight;
		
	public void clickClose() {
			click(close);
	}
	public void EnterFrom() {           
		click(From);
	}
	public void FromAirport() {
		click(Flocation);
	}
	public void EnterTo() {
	   click(To);
	}                                      
	public void clickAirport() {
		click(Toairport);
	}
	
	public void ClickCalender() {
		click(Closecal);
	}
	public void clickSearch() {
		click(searchflight);
	}
	
	public void ClickRound() {
		click(Round);
	}
    public void ClickSelectdate() {
    	click(SeltDate);
    }
    public void ClickDate() {
    	click(Sdate);
    }
	public void ClickFlight() {
		click(Searchflight);
	}
}
