package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "email")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[text() = 'Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement loginLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}

	public HomePage login(String uName, String pass) {
		userName.sendKeys(uName);
		password.sendKeys(pass);
		loginBtn.click();
		
		return new HomePage();
	}

	public void clickLoginLink() {
		loginLink.click();
		
	}

}
