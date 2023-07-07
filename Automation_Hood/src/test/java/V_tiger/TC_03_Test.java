package V_tiger;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TC_03_Test extends BaseClass {
	@Test
	public void createContact() {
		
		
		homePage.getContactsTab().click();
		contactPage.getCreateContactIcon().click();
		contactPage.getLastNameTF().sendKeys(utility.readingDataFromPropertFile("lastname"));
		contactPage.getSaveButton().click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		//ut.switchToAlert().accept();
			
		
	}

}
