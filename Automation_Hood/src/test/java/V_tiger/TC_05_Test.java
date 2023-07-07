package V_tiger;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TC_05_Test extends BaseClass{
	@Test(invocationCount = 2)
	public void createLeadsWithMandatoryTF() {
		
		homePage.getLeadsTab().click();
		
		leadsPage.getCreateLeadIcon().click();
		
		leadsPage.getLastNameTF().sendKeys(utility.readingDataFromPropertFile("lastname"));
		
		leadsPage.getCompantTF().sendKeys(utility.readingDataFromPropertFile("company"));
		
		leadsPage.getSaveButton().click();
		
		
	}
}
