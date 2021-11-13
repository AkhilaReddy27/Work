package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CreateContactPage {
@FindBy(xpath="//input[@name='property(First Name)']") private WebElement LastNametb;
@FindBy(xpath="//input[name='property(Last Name)']")    private WebElement FirstNametb;
@FindBy(xpath="//input[name='property(Account Name)']")    private WebElement AccountNametb;
@FindBy(xpath="//input[name='property(Vendor Name)']")    private WebElement VendorNametb;
@FindBy(xpath="//input[@name='property(Email)']")         private WebElement Emailtb;
@FindBy(xpath="//input[@name='property(Title)']")         private WebElement Titletb;
@FindBy(xpath="//input[@name='property(Department)']")   private WebElement Departmenttb;
@FindBy(xpath="//input[@name='property(Phone)']")        private WebElement phonetb;
@FindBy(xpath="//input[@name='property(Home Phone)']")    private WebElement HomePhonetb;
@FindBy(xpath="//input[@name='property(Other Phone)']")    private WebElement OtherPhonetb;
@FindBy(xpath="//input[@name='property(Fax)']")          private WebElement Faxtb;
@FindBy(xpath="//input[@name='property(Mobile)']")       private WebElement  Mobiletb;
@FindBy(xpath="//input[@name='property(Date of Birth)']") private WebElement DateOfBirthtb;
@FindBy(xpath="//input[@name='property(Assistant)']")    private WebElement  Assistanttb;
@FindBy(xpath="//input[@name='property(Asst Phone)']")    private WebElement AsstPhonetb;
@FindBy(xpath="//input[@name='property(Reports To)']")    private  WebElement ReportsTo;
@FindBy(xpath="//input[@name='property(Mailing Street)']") private WebElement MailingStreet;
@FindBy(xpath="//input[@name='property(Other Street)']")   private WebElement  OtherStreet;
@FindBy(xpath="//input[@name='property(Mailing City)']")   private WebElement MailingCity;
@FindBy(xpath="//input[@name='property(Other City)']")     private WebElement   OtherCity;
@FindBy(xpath="//input[@name='property(Mailing State)']")  private WebElement  MailingState;
@FindBy(xpath="//input[@name='property(Other State)']")    private WebElement  OtherState;
@FindBy(xpath="//input[@name='property(Mailing Zip)']")    private WebElement MailingZip;
@FindBy(xpath="//input[@name='property(Other Zip)']")      private WebElement Otherzip;
@FindBy(xpath="//input[@name='property(Mailing Country)']") private WebElement MailingCountry;
@FindBy(xpath="//input[@name='property(Other Country)']")   private WebElement  OtherCountry;
@FindBy(xpath="//textarea[@name='property(Description)']")    private WebElement  Description;
@FindBy(xpath="//(input[@value='Save'])[2]") private WebElement Savebtn;
@FindBy(xpath="//input[@name='Cancel']") private WebElement Cancel;

public  CreateContactPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public WebElement getLastNametb() {
	return LastNametb;
}
public WebElement getFirstNametb() {
	return FirstNametb;
}
public WebElement getAccountNametb() {
	return AccountNametb;
}
public WebElement getVendorNametb() {
	return VendorNametb;
}
public WebElement getEmailtb() {
	return Emailtb;
}
public WebElement getTitletb() {
	return Titletb;
}
public WebElement getDepartmenttb() {
	return Departmenttb;
}
public WebElement getPhonetb() {
	return phonetb;
}
public WebElement getHomePhonetb() {
	return HomePhonetb;
}
public WebElement getOtherPhonetb() {
	return OtherPhonetb;
}
public WebElement getFaxtb() {
	return Faxtb;
}
public WebElement getMobiletb() {
	return Mobiletb;
}
public WebElement getDateOfBirthtb() {
	return DateOfBirthtb;
}
public WebElement getAssistanttb() {
	return Assistanttb;
}
public WebElement getAsstPhonetb() {
	return AsstPhonetb;
}
public WebElement getReportsTo() {
	return ReportsTo;
}
public WebElement getMailingStreet() {
	return MailingStreet;
}
public WebElement getOtherStreet() {
	return OtherStreet;
}
public WebElement getMailingCity() {
	return MailingCity;
}
public WebElement getOtherCity() {
	return OtherCity;
}
public WebElement getMailingState() {
	return MailingState;
}
public WebElement getOtherState() {
	return OtherState;
}
public WebElement getMailingZip() {
	return MailingZip;
}
public WebElement getOtherzip() {
	return Otherzip;
}
public WebElement getMailingCountry() {
	return MailingCountry;
}
public WebElement getOtherCountry() {
	return OtherCountry;
}
public WebElement getDescription() {
	return Description;
}
public WebElement getButton() {
	return Savebtn;
}
public WebElement getCancel() {
	return Cancel;
}
public void  lastNametb(String LastName)
{
 LastNametb.sendKeys("Akki"); 
}
	
}









