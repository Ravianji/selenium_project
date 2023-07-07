package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactIcon;
	
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement addOrgNameIcon;
	
	@FindBy(name="lastname")
	private WebElement lastNameTF;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	public WebElement getAddOrgNameIcon() {
		return addOrgNameIcon;
	}

	
	
	public WebElement getCreateContactIcon() {
		return createContactIcon;
	}
	public WebElement getLastNameTF() {
		return lastNameTF;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
