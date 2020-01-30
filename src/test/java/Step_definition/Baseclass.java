package Step_definition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.Before;

public class Baseclass {
	static WebDriver driver;

    @Parameters("browsers")
	@Before
	public static void driverinitialize(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gomathi.karnan\\Downloads\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\gomathi.karnan\\eclipse-workspace\\naveencucumber\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
		if(browsername.equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\gomathi.karnan\\Downloads\\chromedriver\\chromedriver.exe");
			driver = new InternetExplorerDriver();

		}
		
	}
}
