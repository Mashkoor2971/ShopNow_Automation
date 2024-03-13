package com.flipkart.steps;

import com.flipkart.pages.*;

public class steps {

	Homepage Homepage = new Homepage();
	PLPpage PLPpage = new PLPpage();
	PDPpage PDPpage = new PDPpage();
	Cartpage Cartpage = new Cartpage();
	Checkoutpage Checkoutpage = new Checkoutpage();
	YahooPage Yahoo = new YahooPage();

	public void userNavigatesToHomePage() {
		Homepage.userNavigatesToFlipkartHomePage();
	}

	public void userVerifiesPageTitle(String title) {
		Homepage.userVerifiesPageTitle(title);
	}

	public void userSearchesProductByEnter(String keyword) {
		Homepage.userSearchesProductByEnter(keyword);
	}

	public void clickOnProductInPLP() {
		PLPpage.clickOnProductInPLP();
	}

	public void addTheProductToTheCart() {
		PDPpage.addTheProductToTheCart();
	}

	public void clickOnCartFromTopNav() {
		Cartpage.clickOnCartFromTopNav();
	}

	public void userClicksOnProceedToCheckoutButton() {
		Cartpage.userClicksOnProceedToCheckoutButton();
	}

	public void userEntersEmail(String email) {
		Checkoutpage.userEntersEmail(email);
	}

	public void userGetsOTPfromTheMail(String username, String password) {
		Yahoo.userGetsOTPfromTheMail(username, password);
	}

}
