package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class CompaignPage {
	@FindBy(xpath="//a[text()='Campaigns']") public WebElement Compaigntab;
	
public  CompaignPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getNewCompaigntab() {
	return Compaigntab;
}

public void clickCompaigntab(){
	Compaigntab.click();
}
}


