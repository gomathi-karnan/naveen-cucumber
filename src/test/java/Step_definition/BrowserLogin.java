package Step_definition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObjectModel.LoginXpath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class BrowserLogin {

	
	static LoginXpath xpath = PageFactory.initElements(Baseclass.driver, LoginXpath.class);

	// Pagefactory.initelements("LoginXpath.class");


	// @When("^get in to \"([^\"]*)\"$")
	@When("^get in to <url>$")
	public void get_in_to_url(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

//		List<List<String>> list = arg1.asLists(String.class);
//		List<List<String>> s = arg1.raw();
//		System.out.println("Printing" + s.get(0).get(0).toString());
		//String url = s.get(0).get(0).toString();
		
		Baseclass.driver.get(url);
		// driver.get("https://ui.cogmento.com/");
	}

	@Then("^verify the login page$")
	public void verify_the_login_page() throws Throwable {
		String CurrentPageTitle = Baseclass.driver.getTitle();
		System.out.println(CurrentPageTitle);
		String expectedTitle = "Cogmento CRM";
		Assert.assertEquals(expectedTitle, CurrentPageTitle);
	}

	@Given("^enter \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void enter_and_to_login(String emailaddress, String password) throws Throwable {
		//System.out.println(emailaddress + " " + password);
		xpath.clicklogin(emailaddress, password);

	}

	@When("^user is in the right page$")
	public void user_is_in_the_right_page() throws Throwable {
		String CurrentPageTitle = Baseclass.driver.getTitle();
		System.out.println(CurrentPageTitle);
		String expectedTitle = "Cogmento CRM";
		Assert.assertEquals(expectedTitle, CurrentPageTitle);
		}
}
