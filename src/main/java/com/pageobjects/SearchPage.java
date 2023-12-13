package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchPage extends BaseClass {

	@FindBy(xpath = "//input[@id='igt_input_search']")
	WebElement searchBox;
	
	@FindBy(xpath = "//span[@class='igt-button-label']")
	WebElement searchClick;
	
	@FindBy(xpath = "//span[contains(text(),'ENROLL')]")
	WebElement enrollBtnClick;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SearchResults SearchPlayerID(String playerid)
	{
		searchBox.sendKeys(playerid);
		//searchBox.se
		searchClick.click();
		return new SearchResults();
	}
	
	public SearchResults SearchPlayerFname(String fname)
	{
		searchBox.sendKeys(fname);
		searchClick.click();
		return new SearchResults();
	}
	
	public SearchResults SearchPlayerLname(String lname)
	{
		searchBox.sendKeys(lname);
		searchClick.click();
		return new SearchResults();
	}
	
	public void SearchPlayerDOB()
	{
		
	}
	
	public void SearchPlayerPhone()
	{
		
	}
	
	
}
