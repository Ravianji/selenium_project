package V_tiger;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TC_07_Test extends BaseClass {

	@Test
	public void dataProviders() throws InterruptedException {
		
		ut.handlingDropDown(homePage.getQuickCreateDropdown(), "New Event");
		newEventDD.getSubjectTF().sendKeys("project");
	
		ut.handlingDropDown(newEventDD.getStatusDD(), "Planned");
		newEventDD.getStartDateTF().clear();
		ut.enteringDataIntoElement("2023-06-28",newEventDD.getStartDateTF() );
		newEventDD.getStartTimeTF().clear();
		Thread.sleep(2000);
		ut.enteringDataIntoElement("12-20", newEventDD.getStartTimeTF());
		newEventDD.getEndDateTF().clear();
		ut.enteringDataIntoElement("2023-08-18", newEventDD.getEndDateTF());
		ut.handlingDropDown(newEventDD.getActivityTypeDD(), "Meeting");
		Thread.sleep(2000);
		newEventDD.getAssignToGroupRadioButton().click();
		Thread.sleep(2000);
		ut.handlingDropDown(newEventDD.getAassignToGroupDD(), "Support Group");
		newEventDD.getSaveButton();
		
		
		
		
	}
}
