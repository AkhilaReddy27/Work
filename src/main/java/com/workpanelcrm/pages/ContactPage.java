package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class ContactPage {

@FindBy(xpath="//a[text()='Contacts']")  private WebElement Contactstab;

public ContactPage()
{
PageFactory.initElements(BaseTest.driver, this);	
}

public WebElement getContactstab() {
	return Contactstab;
}

public void clickContactstab() {
	
	Contactstab.click();
	
}


}
