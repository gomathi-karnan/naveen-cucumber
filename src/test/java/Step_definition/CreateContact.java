package Step_definition;

import org.openqa.selenium.support.PageFactory;

import PageObjectModel.ContactsXpath;
import PageObjectModel.LoginXpath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateContact {
	static ContactsXpath xpath = PageFactory.initElements(Baseclass.driver, ContactsXpath.class);

	@Given("^go to contacts$")
	public void go_to_contacts() throws Throwable {
xpath.clickContacts();
	}

	@When("^click on new user button$")
	public void click_on_new_user_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		xpath.newcontacts();
	}

	@Then("^fill the mandatory details$")
	public void fill_the_mandatory_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^save$")
	public void save() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
