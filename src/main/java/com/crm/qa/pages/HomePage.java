package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[@class='user-display']")
	@CacheLookup
	WebElement lable_userName;
	
	@FindBy(linkText="Contacts")
	@CacheLookup
	WebElement link_contacts;
	
	@FindBy(linkText="Deals")
	@CacheLookup
	WebElement link_deals;
	
	@FindBy(linkText="Tasks")
	@CacheLookup
	WebElement link_tasks;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();		
	}
	
	public ContactsPage clickOnContactsLink() {
		link_contacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		link_deals.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		link_tasks.click();
		return new TasksPage();
		
	}
	
	public String getName() {
		return lable_userName.getText();
		
	}

}
