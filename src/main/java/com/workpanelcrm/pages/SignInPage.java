package com.workpanelcrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class SignInPage {
	public static WebDriver driver;
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInBtn;
	
	
public SignInPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getUntb() {
	return untb;
}


public WebElement getPwtb() {
	return pwtb;
}

public WebElement getSignInBtn() {
	return signInBtn;
}
public void login(String un,String pw)
{
	untb.sendKeys(un);
	pwtb.sendKeys(pw);
	signInBtn.click();
}



}
	
