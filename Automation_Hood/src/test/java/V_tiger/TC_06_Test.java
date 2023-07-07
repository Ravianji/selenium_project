package V_tiger;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TC_06_Test extends BaseClass {
	@Test
	public void deleteleads() {
		homePage.getLeadsTab().click();
		leadsPage.getCheckBox().click();
		leadsPage.getDeleteButton().click();;
		ut.switchToAlert().accept();
		
		
		
		
	}

}
