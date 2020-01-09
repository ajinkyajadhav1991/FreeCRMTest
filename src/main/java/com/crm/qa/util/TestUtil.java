package com.crm.qa.util;

import org.openqa.selenium.WebElement;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	

}
