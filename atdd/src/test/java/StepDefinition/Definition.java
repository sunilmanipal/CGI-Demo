package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Definition {
	WebDriver ffdriver;
	String Title;
	@Given("^Login application should be present$")
	public void login_application_should_be_present()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		 ffdriver = new FirefoxDriver();
		 ffdriver.manage().window().maximize();
		 ffdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Test login with valid and invalid cases$")
	public void test_login_with_valid_and_invalid_cases()  {
	    // Write code here that turns the phrase above into concrete actions
	   Title= ffdriver.getTitle();
	}

	@Then("^login should be successfull$")
	public void login_should_be_successfull()  {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals("OrangeHRM", Title);
	   System.out.println("The title is same");
	}

}
