package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class VendorPage {
@FindBy(xpath="//a[text()='Vendors']")private WebElement  Vendorstb;

public VendorPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public WebElement getVendorstb() {
	return Vendorstb;
}
public void clickVendorstb()
{
	Vendorstb.click();
}

}
