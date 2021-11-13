package com.WorkPanel.vendor;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.workpanelcrm.genericLib.BaseTest;
import com.workpanelcrm.genericLib.FileLib;
import com.workpanelcrm.genericLib.WebDriverCommonLib;
import com.workpanelcrm.pages.ContactPage;
import com.workpanelcrm.pages.CreatevendorPage;
import com.workpanelcrm.pages.CustomerViewPage;
import com.workpanelcrm.pages.SignInPage;
import com.workpanelcrm.pages.VendorPage;




public class CreateVendorTest extends BaseTest {

@Test
public void  CreateVendor()throws Throwable{
	
	
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
	//sp.login("rashmi@dell.com","123456");	


	WebDriverCommonLib wlib=new WebDriverCommonLib();
	
	wlib.verify(flib.readPropData(PROP_PATH,"homeTitle"),wlib.getPageTitle(),
			"homeTitle");
	Thread.sleep(3000);
	VendorPage vp=new VendorPage();
	vp.clickVendorstb();
	
		
	
	CustomerViewPage cvp1 = new CustomerViewPage();
	cvp1.ClickNewVendorBtn();

	CreatevendorPage cvp= new CreatevendorPage();
	cvp.VendorNametb(flib.readPropData(PROP_PATH, "VendorName"));
	
		
	}

}
