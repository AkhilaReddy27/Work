package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;
import com.workpanelcrm.genericLib.WebDriverCommonLib;

public class CreatevendorPage {
	
	@FindBy(xpath="//input[@name='property(Vendor Name)']") private WebElement VendorNametb;
	@FindBy(xpath="//input[@name='property(Phone)']") private WebElement  propertyPhonetb;
	@FindBy(xpath="//input[@name='property(Email)']") private WebElement  propertyEmailtb;
	@FindBy(xpath="//input[@name='property(Website)']") private WebElement propertyWebsitetb;
	@FindBy(xpath="//input[@name='property(Category)']")private WebElement categorytb;
	@FindBy(xpath="//input[@name='property(Street)']")private WebElement streettb;
	@FindBy(xpath="//input[@name='property(City)']")private WebElement citytb;
	@FindBy(xpath="//input[@name='property(State)']")private WebElement statetb;
	@FindBy(xpath="//input[@name='property(Zip Code)']") private WebElement zipcodetb;
	@FindBy(xpath="//input[@name='property(Country)']") private WebElement countrytb;
	@FindBy(xpath="//textarea[@name='property(Description)']") private WebElement descriptiontb;
	@FindBy(xpath="//(input[@value='Save'])[2]") private WebElement savetb;
	@FindBy(xpath="//(input[@value='Edit'])[2]") private WebElement edittb;
	@FindBy(xpath="//(input[@value='Save'])[2]") private WebElement edsavetb;
	@FindBy(xpath="//(input[@value='Clone'])[2]")private WebElement clonetb;
	@FindBy(xpath="//(input[@value='Save'])[2]")private WebElement clsavetb;
	@FindBy(xpath="//(input[@value='Print Preview'])[2]") private WebElement printpreviewtb;
	@FindBy(xpath="//(input[@value='Print Page'])[2]") private WebElement printpagetb;
	@FindBy(xpath="//select[@name='property(GL Account)']") private WebElement GLAccountDropDown;
	public  CreatevendorPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	public WebElement getVendorNametb() { 
		return VendorNametb;
	}
	public WebElement getPropertyPhonetb() {
		return propertyPhonetb;
	}
	public WebElement getPropertyEmailtb() {
		return propertyEmailtb;
	}
	public WebElement getPropertyWebsitetb() {
		return propertyWebsitetb;
	}
	public WebElement getCategorytb() {
		return categorytb;
	}
	public WebElement getStreettb() {
		return streettb;
	}
	public WebElement getCitytb() {
		return citytb;
	}
	public WebElement getStatetb() {
		return statetb;
	}
	public WebElement getZipcodetb() {
		return zipcodetb;
	}
	public WebElement getCountrytb() {
		return countrytb;
	}
	public WebElement getDescriptiontb() {
		return descriptiontb;
	}
	public WebElement getSavetb() {
		return savetb;
	}
	public WebElement getEdittb() {
		return edittb;
	}
	public WebElement getEdsavetb() {
		return edsavetb;
	}
	public WebElement getClonetb() {
		return clonetb;
	}
	public WebElement getClsavetb() {
		return clsavetb;
	}
	public WebElement getPrintpreviewtb() {
		return printpreviewtb;
	}
	public WebElement getPrintpagetb() {
		return printpagetb;
	}
	public WebElement getGLAccountDropDown() {
		return GLAccountDropDown;
	}

	
	
	public void VendorNametb(String VendorName) {
		
		VendorNametb.sendKeys("VendorName");
		WebDriverCommonLib wlib= new WebDriverCommonLib();
	
		wlib.selectOption("Sales-Hardware", GLAccountDropDown);

			
	
	}


		
}