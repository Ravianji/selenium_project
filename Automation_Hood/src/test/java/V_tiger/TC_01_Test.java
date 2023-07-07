package V_tiger;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import objectRepository.ContactPage;
@Listeners(genericLibraries.ListenerIplementation.class)
public class TC_01_Test extends BaseClass {
	@Test
	public void createOraganization()  {
	
		contactPage =new ContactPage(driver);
		homePage.getOrganizatinsTab().click();
		ogpage.getCreateOrganizationButton().click();
		ogpage.getOrganizationNameTF().sendKeys(utility.readingDataFromPropertFile("orgname"));
		ogpage.getSaveButton().click();

		//WebElement element = ogpage.getAdministratorIcon();
		//ut.moveToElement(element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		ut.switchToAlert().accept();
	//	Thread.sleep(3000);
		
		System.out.println("signed out from application");
		
		//assertEquals(driver.getTitle().equals(contactPage), true);


	}

}
