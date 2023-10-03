package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.Utils.SeWrappers;

public class BookingPage extends SeWrappers {
	
	@FindBy(xpath="//div[text()='one way']")
	WebElement One;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement Continue;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement FName;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement LName;

	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement Number;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement Email;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement City;
	
	@FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement fName;
	
	@FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement lName;
	
	@FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box'][1]")
	WebElement MNumber;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement CN;
	
	
	public void ClickOne() {
		click(One);
	}
	public void ClickSearch() {
		click(searchflight);
	}
	public void ClickContinue() {
		click(Continue);
	}
	public void EnterFName(String First) {
		typeText(FName,First);
	}
	public void EnterLName(String Last) {
		typeText(LName,Last);
	}
	public void EnterNumber(String N) {
		typeText(Number,N);
	}
	public void EnterEmail(String Mail) {
		typeText(Email,Mail);
	}
	public void EnterCity(String city) {
		typeText(City,city);
	}
	public void EnterNameFirst(String f) {
		typeText(fName,f);
	}
	public void EnterNameLast(String l) {
		typeText(lName,l);
	}
	public void EnterMNumber(String No) {
		typeText(MNumber,No);
	}
	public void ClickCon() {
		click(CN);
	}
	}

