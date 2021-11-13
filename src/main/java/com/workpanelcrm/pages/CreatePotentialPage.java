package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CreatePotentialPage {
@FindBy(xpath="//input[@name='property(Potential Name)']") private WebElement potentialNametb;	
@FindBy(xpath="//input[@name='property(Amount)']") private WebElement Amounttb;
@FindBy(xpath="//input[@name='property(Closing Date)']")private WebElement closingDatetb;
@FindBy(xpath="//input[@name='property(Account Name)']")private WebElement accountNametb;
@FindBy(xpath="//input[@name='property(Next Step)']") private WebElement nextSteptb;
@FindBy(xpath="//input[@name='property(Probability']")private WebElement probabilitytb;
@FindBy(xpath="//input[@name='property(Campaign Source)']") private WebElement compaignSourcetb;
@FindBy(xpath="//textarea[@name='property(Description)']") private WebElement Descriptiontb;

public CreatePotentialPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getPotentialNametb() {
	return potentialNametb;
}

public WebElement getAmounttb() {
	return Amounttb;
}

public WebElement getClosingDatetb() {
	return closingDatetb;
}

public WebElement getAccountNametb() {
	return accountNametb;
}

public WebElement getNextSteptb() {
	return nextSteptb;
}

public WebElement getProbabilitytb() {
	return probabilitytb;
}

public WebElement getCompaignSourcetb() {
	return compaignSourcetb;
}

public WebElement getDescriptiontb() {
	return Descriptiontb;
}

public void potentialNametb(String akki)
{
	potentialNametb.sendKeys("akki");
}

}



