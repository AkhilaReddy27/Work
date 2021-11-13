package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CreateAccountPage {
@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement AccountNametb;
@FindBy(xpath="//input[@name='property(Phone)']") private WebElement phonetb;
@FindBy(xpath="//input[@name='property(Account Site)']") private WebElement Accountsitetb;
@FindBy(xpath="//input[@name='property(Fax)']") private WebElement Faxtb;
@FindBy(xpath="//input[@name='property(Parent Account)']") private WebElement Parenttb;
@FindBy(xpath="//input[@name='property(Website)']")  private WebElement Websitetb;
@FindBy(xpath="//input[@name='property(Account Number)']") private WebElement AccountNumbertb;
@FindBy(xpath="//input[@name='property(Ticker Symbol)']")  private WebElement TickerSymboltb;
@FindBy(xpath="//input[@name='property(Employees)']") private WebElement Employeestb;
@FindBy(xpath="//input[@name='property(Annual Revenue)']") private WebElement Annualrevenuetb;
@FindBy(xpath="//input[@name='property(SIC Code)']") private WebElement SICCodetb;
@FindBy(xpath="//input[@name='property(Billing Street)']") private WebElement BillingStreettb;
@FindBy(xpath="//input[@name='property(Billing State)']") private WebElement BillingStatetb;
@FindBy(xpath="//input[@name='property(Shipping City)']") private WebElement ShippingCitytb;
@FindBy(xpath="//input[@name='property(Shipping Street']")private WebElement ShippingStreettb;
@FindBy(xpath="//input[@name='property(Shipping State)']") private WebElement shippingStatetb;
@FindBy(xpath="//input[@name='property(Billing Code)']") private WebElement Billingcodetb;
@FindBy(xpath="//input[@name='property(Shipping Code)']") private  WebElement ShippingCodetb;
@FindBy(xpath="//input[@name='property(Billing Country)']") private WebElement BillingCountrytb;
@FindBy(xpath="//textarea[@name='property(Description)']") private WebElement Descriptiontb;
@FindBy(xpath="//(input[@value='Save'])[2]") private WebElement  Savetb;
@FindBy(xpath="//(input[@value='Edit'])[2]") private WebElement Edittb;
@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement AccountNametb1;
public  CreateAccountPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public WebElement getAccountNametb() {
	return AccountNametb;
}
public WebElement getPhonetb() {
	return phonetb;
}
public WebElement getAccountsitetb() {
	return Accountsitetb;
}
public WebElement getFaxtb() {
	return Faxtb;
}
public WebElement getParenttb() {
	return Parenttb;
}
public WebElement getWebsitetb() {
	return Websitetb;
}
public WebElement getAccountNumbertb() {
	return AccountNumbertb;
}
public WebElement getTickerSymboltb() {
	return TickerSymboltb;
}
public WebElement getEmployeestb() {
	return Employeestb;
}
public WebElement getAnnualrevenuetb() {
	return Annualrevenuetb;
}
public WebElement getSICCodetb() {
	return SICCodetb;
}
public WebElement getBillingStreettb() {
	return BillingStreettb;
}
public WebElement getBillingStatetb() {
	return BillingStatetb;
}
public WebElement getShippingCitytb() {
	return ShippingCitytb;
}
public WebElement getShippingStreettb() {
	return ShippingStreettb;
}
public WebElement getShippingStatetb() {
	return shippingStatetb;
}
public WebElement getBillingcodetb() {
	return Billingcodetb;
}
public WebElement getShippingCodetb() {
	return ShippingCodetb;
}
public WebElement getBillingCountrytb() {
	return BillingCountrytb;
}
public WebElement getDescriptiontb() {
	return Descriptiontb;
}
public WebElement getSavetb() {
	return Savetb;
}
public WebElement getEdittb() {
	return Edittb;
}
public WebElement getAccountNametb1() {
	return AccountNametb1;
}

public void AccountNametb(String AccountName) {
	
    AccountNametb.sendKeys(AccountName);
	


}
}

