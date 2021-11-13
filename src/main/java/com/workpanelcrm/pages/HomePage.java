package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class HomePage {
//@FindBy(xpath="//a[text()='Contacts']") private WebElement Contacts;
//public  HomePage()
//{
	//PageFactory.initElements(BaseTest.driver,this);
//}
//}

@FindBy(xpath="//a[text()='Home']") private WebElement  Hometab;
public  HomePage()
{
PageFactory.initElements(BaseTest.driver,this);	
}
public WebElement getHometab() {
	return Hometab;
}

public void clickHometab() {
	Hometab.click();
	
}

}


