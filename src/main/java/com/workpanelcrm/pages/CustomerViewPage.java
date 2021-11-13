package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CustomerViewPage {
@FindBy(xpath="//input[@value='New Contact']")private WebElement  newContactBtn; 
@FindBy(xpath="//input[@value='New Campaign']") private WebElement   newCompaignBtn;
@FindBy(xpath="//input[@value='New Vendor']")  private WebElement  NewVendorBtn;
@FindBy(xpath="//input[@value='New Lead']") private WebElement  newLeadBtn;
@FindBy(xpath="//input[@value='New Account']") private WebElement NewAccountBtn;
public CustomerViewPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getNewContactBtn() {
	return newContactBtn;
}
public void clickNewContactBtn()
{
	newContactBtn.click();
}

public void ClicknewcompaignBtn()
{
	newCompaignBtn.click();
}

public WebElement getNewCompaignBtn() {
	return newCompaignBtn;
}

public void ClickNewVendorBtn()
{
	NewVendorBtn.click();
}


public WebElement getNewVendorBtn() {
	return NewVendorBtn;
}

public WebElement getnewLeadBtn() {
	
	return newLeadBtn;
}
public void ClicknewLeadBtn(){
newLeadBtn.click();	
}


public WebElement getNewAccountBtn() {
	return NewAccountBtn;
}

public void ClickNewAccountBtn(){
	NewAccountBtn.click();
}




}

