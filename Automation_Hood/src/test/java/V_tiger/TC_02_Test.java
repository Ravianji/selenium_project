package V_tiger;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TC_02_Test extends BaseClass {
	@Test
	public void createOrgWithTypeAndIndustry() {

		
		homePage.getOrganizatinsTab().click();
		ogpage.getCreateOrganizationButton().click();
		ogpage.getOrganizationNameTF().sendKeys("MBH");
		WebElement type = ogpage.getTypeDD();
		ut.selectReference(type).selectByValue("Analyst");
		WebElement industry = ogpage.getIndustryDD();
		ut.selectReference(industry).selectByValue("Banking");
		ogpage.getSaveButton().click();
		System.out.println("test case passed");

		
	}
}
