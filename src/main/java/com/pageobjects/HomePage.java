package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pageEventdriver.PageEvents;

public class HomePage extends BaseClass{
	
	//PageEvents event = new PageEvents();
	
	@FindBy(xpath = "//span[@id='searchPlayerIcon']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//span[@id='enrollmentIcon']")
	WebElement enrollBtn;
	
	@FindBy(xpath = "//a[normalize-space()='HOME']")
	WebElement HomeBtnFooter;
	
	@FindBy(xpath = "//a[normalize-space()='SEARCH PLAYER']")
	WebElement SearchBtnFooter;
	
	@FindBy(xpath = "//a[normalize-space()='ENROLLMENT']")
	WebElement enrollBtnFooter;
	
	@FindBy(xpath = "//a[normalize-space()='SETTINGS']")
	WebElement settingBtnFooter;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SearchPage searchPlayer()
	{	 //PageEvents.click(driver, searchBtn);
		
		
		searchBtn.click();
		
		return new SearchPage();
	}

	public EnrollPageBasic EnrollPlayer() {
		enrollBtn.click();
		return new EnrollPageBasic();
	}

}
