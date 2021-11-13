package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class LeadsPage {
	
@FindBy(xpath="//[atext()='Leads']") private WebElement leadstb;

public LeadsPage(){
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getLeadstb() {
	return leadstb;
}
public void clickleadstb(){
	leadstb.click();
}

public void Lead() {
	// TODO Auto-generated method stub
	
}

}
