package com.test_StepsFolder;

import com.pageObjectHelper.URLUtility;
import com.testHooks_Utility.TestConfigUtility;
import com.test_PageObjectsModel.SearchGooglePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class GoogleSearch extends TestConfigUtility {

	private static URLUtility appURL = new URLUtility();
	private static SearchGooglePage searchOBJ = new SearchGooglePage();
	
	
	
	@Given("^User is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		appURL.goToGoogleURL();	
	}

	@When("^User type \"([^\"]*)\" on the search text box$")
	public void user_type_on_the_search_text_box(String keyword) throws Throwable {
		log().error("searching for : " + keyword);
		searchOBJ.searchKeyword(keyword);
	}

	@When("^search with Random data$")
	public void search_with_Random_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}
	

}
