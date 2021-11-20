package com.WorkPanel.products;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.workpanelcrm.genericLib.BaseTest;
import com.workpanelcrm.genericLib.FileLib;
import com.workpanelcrm.genericLib.WebDriverCommonLib;
import com.workpanelcrm.pages.ContactPage;
import com.workpanelcrm.pages.CreateContactPage;
import com.workpanelcrm.pages.CreatePotentialPage;
import com.workpanelcrm.pages.CustomerViewPage;
import com.workpanelcrm.pages.CustomerViewPotentialPage;
import com.workpanelcrm.pages.HomePage;
import com.workpanelcrm.pages.PotentialsPage;
import com.workpanelcrm.pages.SignInPage;

public class CreateProductsTest extends  BaseTest{
	
	

	@Test
	
	//Akhila's Test
	public void createProducts() throws Throwable{
SignInPage sp = new SignInPage();
FileLib flib = new FileLib();
sp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
//sp.login("rashmi@dell.com","123456");	


WebDriverCommonLib wlib=new WebDriverCommonLib();
FileLib flib1=new FileLib();
wlib.verify(flib1.readPropData(PROP_PATH,"homeTitle"),wlib.getPageTitle(),
		"homeTitle");

ContactPage cp=new ContactPage();
cp.clickContactstab();

CustomerViewPage cvp= new CustomerViewPage();
cvp.clickNewContactBtn();

CreateContactPage ccp =new CreateContactPage();
ccp.lastNametb(flib.readPropData(PROP_PATH, "lastName"));

PotentialsPage pp=new PotentialsPage();
pp.clickPotentialstab();

CustomerViewPotentialPage cvpp= new CustomerViewPotentialPage();
cvpp.ClicknewPotentialBtn();

CreatePotentialPage cpp =new CreatePotentialPage();
cpp.potentialNametb(flib.readPropData(PROP_PATH, "PotentialName"));
}

	
		
	}


	
	
	
	
	
	



