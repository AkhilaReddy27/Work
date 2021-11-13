package com.WorkPanel.Accounts;

import org.testng.annotations.Test;

import com.workpanelcrm.genericLib.BaseTest;
import com.workpanelcrm.genericLib.FileLib;
import com.workpanelcrm.genericLib.WebDriverCommonLib;
import com.workpanelcrm.pages.AccountPage;
import com.workpanelcrm.pages.CompaignPage;
import com.workpanelcrm.pages.CreateAccountPage;
import com.workpanelcrm.pages.CreateCompaignPage;
import com.workpanelcrm.pages.CustomerViewPage;
import com.workpanelcrm.pages.SignInPage;

public class AccountTest extends BaseTest {
@Test	
	public void AccountTest() throws Throwable{

SignInPage  sp= new SignInPage();
FileLib flib = new FileLib();
sp.login(flib.readPropData(PROP_PATH, "username"),flib.readPropData(PROP_PATH, "password"));
WebDriverCommonLib wlib = new WebDriverCommonLib();
wlib.verify(flib.readPropData(PROP_PATH, "homeTitle"), wlib.getPageTitle(),"homeTitle");
AccountPage ap = new AccountPage();
ap.clickAccountstab();
Thread.sleep(3000);
CustomerViewPage cvp = new CustomerViewPage();
cvp.ClickNewAccountBtn();
CreateAccountPage cap = new CreateAccountPage();
cap.AccountNametb(flib.readPropData(PROP_PATH, "AccountName"));

		
		
}
	

}