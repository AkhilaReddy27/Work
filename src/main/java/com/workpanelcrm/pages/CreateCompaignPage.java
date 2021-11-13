package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CreateCompaignPage {
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement compaignNametb;	
	@FindBy(xpath="//input[@name='property(Start Date)']") private WebElement  StartDatetb;
	@FindBy(xpath="//input[@name='property(End Date)']") private WebElement  EndDatetb;
	@FindBy(xpath="//input[@name='property(Expected Revenue)']")private WebElement ExpectedRevenuetb;
	@FindBy(xpath="//input[@name='property(Budgeted Cost)']") private WebElement BudgetedCosttb;
	@FindBy(xpath="//input[@name='property(Actual Cost)']") private WebElement ActualCosttb;
	@FindBy(xpath="//input[@name='property(Expected Response)']") private WebElement ExpectedResponsetb;
	@FindBy(xpath="//input[@name='property(Num sent)']") private WebElement Numsenttb;

	@FindBy(xpath="//input[@textarea='property(Description)']") private WebElement  propertydescriptiontb;
	public  CreateCompaignPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	 
	public WebElement getCompaignNametb() {
		return compaignNametb;
	}

	public WebElement getStartDatetb() {
		return StartDatetb;
	}

	public WebElement getEndDatetb() {
		return EndDatetb;
	}

	public WebElement getExpectedRevenuetb() {
		return ExpectedRevenuetb;
	}

	public WebElement getBudgetedCosttb() {
		return BudgetedCosttb;
	}

	public WebElement getActualCosttb() {
		return ActualCosttb;
	}

	public WebElement getExpectedResponsetb() {
		return ExpectedResponsetb;
	}

	public WebElement getNumsenttb() {
		return Numsenttb;
	}

	public WebElement getPropertydescriptiontb() {
		return propertydescriptiontb;
	}
	public void compaignNametb(String compaignName) {
		
	     compaignNametb.sendKeys(compaignName);
		
	}

}