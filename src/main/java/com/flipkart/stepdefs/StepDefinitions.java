package com.flipkart.stepdefs;

import com.flipkart.steps.steps;
import io.cucumber.java.en.*;

public class StepDefinitions {
	
	
	steps steps = new steps();

	@Given("^User is on the Flipkart Homepage$")
	public void userNavigatesToHomePage() {
		steps.userNavigatesToHomePage();
	}
	
	@And("^user verifies PageTitle'(.*)'$")
	public void userVerifiesPageTitle(String title) {
	    steps.userVerifiesPageTitle(title);
	}
	
	@When("^User searches for '(.*)' by clicking on enter$")
	public void searchProductByEnter(String keyword) {
		steps.userSearchesProductByEnter(keyword);
	}
	
	@And("^Click on product in PLP then PDP page should be displayed$")
	public void clickOnProductInPLP() {
		steps.clickOnProductInPLP();
	}
	
	@Then("^Add the product to the Cart$")
	public void addTheProductToTheCart() {
		steps.addTheProductToTheCart();
	}
	
	@And("^click on cart Icon from the Top Navigation$")
	public void clickOnCartFromTopNav() {
		steps.clickOnCartFromTopNav();
	}
	
	@Then("^user clicks on Proceed to checkout Button$")
	public void userClicksOnProceedToCheckoutButton() {
	    steps.userClicksOnProceedToCheckoutButton();
	}
	
	@And("^user enters the '(.*)' in login field$")
	public void userEntersEmail(String email) {
	    steps.userEntersEmail(email);
	}
	
	@Then("^user gets the OTP from the mail'(.*)','(.*)'$")
	public void userGetsOTPfromTheMail(String username , String password) {
		steps.userGetsOTPfromTheMail(username, password);
	}










}
