package com.workpanelcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.workpanelcrm.genericLib.BaseTest;

public class PotentialsPage {
@FindBy(xpath="//a[text()='Potentials']") private WebElement Potentialstab;

public PotentialsPage()

{
PageFactory.initElements(BaseTest.driver, this);	
}

public WebElement getPotentialstab() {
	return Potentialstab;
}
public void clickPotentialstab() {
	 Potentialstab.click();
	
}
	


}