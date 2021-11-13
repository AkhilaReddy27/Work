package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CustomerViewPotentialPage {
	@FindBy(xpath="//input[@value='New Potential']") private WebElement newPotentialBtn;
	public CustomerViewPotentialPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public WebElement getNewPotentialBtn() {
	return newPotentialBtn;
}
	
	public void ClicknewPotentialBtn()
	{
		newPotentialBtn.click();
	}
}