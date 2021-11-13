package com.WorkPanel.Compaigns;

import org.testng.annotations.Test;

import com.workpanelcrm.genericLib.BaseTest;
import com.workpanelcrm.genericLib.FileLib;
import com.workpanelcrm.genericLib.WebDriverCommonLib;
import com.workpanelcrm.pages.CompaignPage;
import com.workpanelcrm.pages.CreateCompaignPage;
import com.workpanelcrm.pages.CustomerViewPage;
import com.workpanelcrm.pages.SignInPage;
@Test
public class CompaignsTest extends BaseTest {
public  void CompaignTest() throws Throwable
{
	SignInPage sp = new SignInPage();
	FileLib flib = new FileLib();
	sp.login(flib.readPropData(PROP_PATH, "username"), flib.readPropData(PROP_PATH, "password"));
	
	

WebDriverCommonLib wlib=new WebDriverCommonLib();

wlib.verify(flib.readPropData(PROP_PATH,"homeTitle"),wlib.getPageTitle(),
		"homeTitle");

CompaignPage cp=new CompaignPage();
cp.clickCompaigntab();


CustomerViewPage cvp= new CustomerViewPage();
cvp.ClicknewcompaignBtn();


CreateCompaignPage ccp =new CreateCompaignPage();
ccp.compaignNametb(flib.readPropData(PROP_PATH, "compaignName"));

}
}
