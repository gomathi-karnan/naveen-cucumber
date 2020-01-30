package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsXpath {
	
	@FindBy(xpath=("//div[text()='Contacts']"))
	static WebElement Contacts;
	
	@FindBy(xpath=("//a[@href='/contacts/new']"))
	static WebElement newcontacts;
	
	public static void clickContacts()
	{
		Contacts.click();
	}
	
	public static void newcontacts()
	{
		newcontacts.click();
	}
}

