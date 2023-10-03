package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.Utils.SeWrappers;

public class SignInpage  extends SeWrappers{
	@FindBy(xpath="//div[text()='Signup']")
	WebElement SignIn;
	
	@FindBy(xpath="//option[text()='Select an option']")
	WebElement Value;
	
	@FindBy(xpath="//option[@value='MR']")
	WebElement Select;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(xpath="//a[@class='position-absolute top-50 end-0 translate-middle-y me-3']")
	WebElement calander;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement monthclick;
	
	@FindBy(xpath="//option[@value='0']")
	WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement yearclick;
	
	@FindBy(xpath="//option[@value='1997']")
	WebElement year;
	
	@FindBy(xpath="//input[@type='tel']")
    WebElement phone;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(id="new-password")
	WebElement password;
	
	@FindBy(id="c-password")
	WebElement cpassword;
	
	@FindBy(id="defaultCheck1")
	WebElement CnFrm;
	
	@FindBy(xpath="//button[@class='btn btn-red']")
	WebElement submit;
	
	public void clickSiginIn() {
		click(SignIn);
	}
	public void clickValue() {
		click(Value);
	}
	public void clickSelect() {
		click(Select);
	}
	public void EnterfirstName(String FName) {
		typeText(firstname,FName);
	}
	public void EnterlastName(String Lname) {
		typeText(lastname,Lname);
	}
	public void clickcalander() {
		click(calander);
	}
	public void clickselectmonth() {
		click(monthclick);
	}
	public void Month() {
		
		click(month);
	}
	public void clickselectyear() {
		click(yearclick);
	}
	public void Year() {
		
		click(year);
	}
	public void EnterPhone(String PHnumber) {
		typeText(phone,PHnumber);
	}
	public void EnterEmail(String Mail) {
		typeText(email,Mail);
	}
	public void EnterPassword(String PassWord) {
		typeText(password,PassWord);
	}
	public void CnPassword(String CnPass) {
		typeText(cpassword,CnPass);
	}
	public void ClickAgree() {
		click(CnFrm);
	}
	public void ClickSubmit() {
		click(submit);
	}

}
