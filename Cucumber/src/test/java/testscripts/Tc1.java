package testscripts;

import org.junit.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tc1 {
@Test


@Given("valid Username")
public void valid_Username() {
 
	System.out.println("verified1");
}

@And("valid password")
public void valid_password() {
	System.out.println("verified2");

}

@Then("Verify login page")
public void verify_login_page() {
	System.out.println("verified3");

}

}

