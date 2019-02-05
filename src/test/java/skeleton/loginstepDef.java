package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepDef {
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	    System.out.println("login page");
	   
	}

	@When("^user enters correct credentials and clicks submit button$")
	public void user_enters_correct_credentials_and_clicks_submit_button() throws Throwable {
	    System.out.println("enter credentials and click submit");
	   
	}

	@Then("^user does successful login$")
	public void user_does_successful_login() throws Throwable {
	    System.out.println("successful login");
	   
	}


}
