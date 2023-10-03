package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.Utils.SeWrappers;

public class PaymentPage  extends SeWrappers{
 	
	
	@FindBy(css="div > [data-testid=\"add-ons-continue-footer-button\"]:nth-child(2)")
	WebElement Continue;
	
	@FindBy(id="at_addon_close_icon")
	WebElement Alert;
	
	@FindBy(css="div > [data-testid=\\\"add-ons-continue-footer-button\\\"]:nth-child(2)")
	WebElement CN;
	
	@FindBy(xpath="//div[text()='Review & Pay']")
	WebElement Next;
	
	@FindBy(xpath="//input[@class='card_number']")
	WebElement Card;
	
	@FindBy(xpath="//input[@class='name_on_card']")
	WebElement Name;
	
	@FindBy(xpath="//input[@class='card_exp_month']")
	WebElement Month;          
	
	@FindBy(xpath="//input[@class='card_exp_year']")
	WebElement year;
	
	@FindBy(xpath="//input[@class='security_code']")
	WebElement code;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement Payment;
	
	public void ClickContinue() {               
		click(Continue);
		
	}
	public void ClickAlert() {
		click(Alert);
		MoveToelement(Alert);
	}
	public void ClickCN() {
		click(CN);
	}
	public void clickNext() {
		click(Next);
	}
	public void EnterCard(String Crd) {
		typeText(Card,Crd);
	}
	public void EnterName(String Nm) {
		typeText(Name ,Nm);
	}
	public void EnterMonth(String Mn) {
		typeText(Month,Mn);
					}
	public void EnterYear(String Y) {
		typeText(year,Y);
	}
	public void EnterCode(String Co) {
		typeText(code,Co);
	}
	public void Clickpayment() {
		click(Payment);
	}
}
