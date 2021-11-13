package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class AccountPage {
@FindBy(xpath="//a[text()='Accounts']") private WebElement Accountstab;
public AccountPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getAccountstab() {
	return Accountstab;
}
public void clickAccountstab(){
	Accountstab.click();
}

}





