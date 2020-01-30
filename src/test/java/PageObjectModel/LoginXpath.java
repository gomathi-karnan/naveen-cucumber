package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginXpath {

	@FindBy(name="email")
	static WebElement enteremailaddrress;
	
	
	@FindBy(name="password")
	static WebElement enterpassoword;
	
	@FindBy(xpath=("//div[text()='Login']"))
	static WebElement loginbutton;
	
	public static void clicklogin(String emailaddress, String password)
	{
		enteremailaddrress.sendKeys(emailaddress);
		enterpassoword.sendKeys(password);
		loginbutton.click();
		
	}
	
}
