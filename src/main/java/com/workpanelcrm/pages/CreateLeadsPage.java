package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CreateLeadsPage {
	
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement Companytb;
	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement FirstNametb;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement LastNametb;
	@FindBy(xpath="//input[@name='property(Designation)']")private WebElement designationtb;
	@FindBy(xpath="//input[@name='property(Email)']")  private WebElement emailtb;
	@FindBy(xpath="//input[@name='property(Phone)']") private WebElement phonetb;
	@FindBy(xpath="//input[@name='property(Fax)']") private  WebElement faxtb;
	@FindBy(xpath="//input[@name='property(Mobile)']") private WebElement mobiletb;
	@FindBy(xpath="//input[@name='property(Website)']") private WebElement websitetb;
	@FindBy(xpath="//input[@name='property(Lead Source)']") private WebElement leadsourcetb;
	@FindBy(xpath="//input[@name='property(No of Employees)']") private WebElement noofemployeestb;
	@FindBy(xpath="//input[@name='property(Annual Revenue)']")private WebElement AnnualRevenuetb;
    @FindBy(xpath="//input[@name='property(Campaign Source)']") private WebElement CampaignSourcetb;
    @FindBy(xpath="//input[@name='property(Street)']")private WebElement Streettb;
    @FindBy(xpath="//input[@name='property(City)']") private WebElement Citytb;
    @FindBy(xpath="//input[@name='property(State)']")private WebElement Statetb;
    @FindBy(xpath="//input[@name='property(Zip Code)']")private WebElement zipcodetb;
    @FindBy(xpath="//input[@name='property(Country)']") private WebElement countrytb;
    @FindBy(xpath="//textarea[@name='property(Description)']") private WebElement descriptiontb;
    @FindBy(xpath="//input[@value='Save']")  private WebElement  Savetb;
    
    
    public CreateLeadsPage(){
    	PageFactory.initElements(BaseTest.driver,this);
    	   	
    }


	public WebElement getCompanytb() {
		return Companytb;
	}


	public WebElement getFirstNametb() {
		return FirstNametb;
	}


	public WebElement getLastNametb() {
		return LastNametb;
	}


	public WebElement getDesignationtb() {
		return designationtb;
	}


	public WebElement getEmailtb() {
		return emailtb;
	}


	public WebElement getPhonetb() {
		return phonetb;
	}


	public WebElement getFaxtb() {
		return faxtb;
	}


	public WebElement getMobiletb() {
		return mobiletb;
	}


	public WebElement getWebsitetb() {
		return websitetb;
	}


	public WebElement getLeadsourcetb() {
		return leadsourcetb;
	}


	public WebElement getNoofemployeestb() {
		return noofemployeestb;
	}


	public WebElement getAnnualRevenuetb() {
		return AnnualRevenuetb;
	}


	public WebElement getCampaignSourcetb() {
		return CampaignSourcetb;
	}


	public WebElement getStreettb() {
		return Streettb;
	}


	public WebElement getCitytb() {
		return Citytb;
	}


	public WebElement getStatetb() {
		return Statetb;
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
		return Savetb;
	}
    public void FirstNametb(String FirstName){
    FirstNametb.sendKeys("FirstName");
    }
    
}
