 package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.Utils.SeWrappers;

public class LoginPage  extends SeWrappers{
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement Login;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement Loginbutton;
	
	public void clickLogin() {
		click(Login);
	}
	public void EnterNumber(String No) {
		typeText(mobile,No);
	}
	public void EnterPassword(String pass) {
		typeText(password,pass);
	}
	public void clickButtonLogin() {
		click(Loginbutton);
	}
	
}
