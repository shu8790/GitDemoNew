package stepDefination;

//import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps 
{
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
		System.out.println("User is on NetBanking landing page");
	    
	}

	@When("user login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String strArg1, String strArg2){
		System.out.println(strArg1);
		System.out.println(strArg2);
		System.out.println("user login into application with username and password");
	    
	}

	@Then("^home screen is populate$")
	public void home_screen_is_populate() throws Throwable {
		System.out.println("home screen is populate");
	    
	}

	@Then("cards are displayed {string}")
	public void cards_are_displayed(String StrArg3) {
		System.out.println("cards are displayed "+StrArg3);
		
	    
	}

	
}
