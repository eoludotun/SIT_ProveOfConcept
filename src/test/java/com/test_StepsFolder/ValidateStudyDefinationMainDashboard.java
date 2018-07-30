package com.test_StepsFolder;
//package test_StepsFolder;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//import pageObjectHelper.URLUtility;
//import testHooks_Utility.TestConfigUtility;
//import test_PageObjectsModel.ValidateStudyDefMainPage;
//
//public class ValidateStudyDefinationMainDashboard extends TestConfigUtility  {
//
//	private static URLUtility appURL = new URLUtility();
//	private static ValidateStudyDefMainPage studyDefOBJ = new ValidateStudyDefMainPage();
//	
//	
//	
//	@When("^User completed Login Pre-conditions, now on the breadcrump page$")
//	public void user_completed_Login_Pre_conditions_now_on_the_breadcrump_page() throws Throwable {
//		appURL.goToStudyURL();
//	    log().info("PLEASE Implement logs with valid credentials");
//	    studyDefOBJ.studyDefinationKeyWord();
//	}
//	
//	@Given("^User is on Study Defination Login Page$")
//	public void user_is_on_Study_Defination_Login_Page() throws Throwable {
//		appURL.goToStudyURL();
//	}
//
//	@Given("^User logs in with \"([^\"]*)\" User credentials$")
//	public void user_logs_in_with_User_credentials(String login) throws Throwable {
//		  log().info("user logs with valid credentials is not enabled " + login);
//	}
//
//	@When("^The user navigates to the breadcrump$")
//	public void the_user_navigates_to_the_breadcrump() throws Throwable {
//		studyDefOBJ.studyDefinationKeyWord();
//	}
//	
//	@Then("^Validate \"([^\"]*)\" displayed on the dashboard$")
//	public void validate_displayed_on_the_dashboard(String expectedworkSpace) throws Throwable {
//		log().info(studyDefOBJ.validateWorkSpace(expectedworkSpace));
//		String actualworkSpace = studyDefOBJ.validateWorkSpace(expectedworkSpace).getText();
//		checkMatchingValues(actualworkSpace, expectedworkSpace);
//
//	}
//	
//	@Then("^Validate \"([^\"]*)\"displays on the current dashboard$")
//	public void validate_displays_on_the_current_dashboard(String expectedMsg) throws Throwable {
//		String actualMsg = studyDefOBJ.studyDefinationKeyWord();
//		checkMatchingValues(actualMsg, expectedMsg);
//	}
//	
//	@Then("^Clicks the menu icon on the main dashboard$")
//	public void clicks_the_menu_icon_on_the_main_dashboard() throws Throwable {
//		studyDefOBJ.clickMenueOndashboard();
//	}
//	
//	@SuppressWarnings("deprecation")
//	@Then("^validate \"([^\"]*)\" is hidden from user and does not displayed on the dashboard$")
//	public void validate_is_hidden_from_user_and_does_not_displayed_on_the_dashboard(String expectedworkSpace) throws Throwable {
//		boolean isDisplay = false;
//		if (!studyDefOBJ.validateWorkSpace(expectedworkSpace).isDisplayed())
//		{
//			log().info("OPS! the Workspace with name : " + studyDefOBJ.validateWorkSpace(expectedworkSpace).getText() + " Can be seen");
//			isDisplay = false;
//			Assert.assertTrue(isDisplay);					
//		}
//		else
//		{
//			log().info("The Workspace with name : " + studyDefOBJ.validateWorkSpace(expectedworkSpace).getText() + " is hidden from User");
//			isDisplay = true;
//			Assert.assertTrue(isDisplay);
//		}
//	}
//	
//	@When("^User clicks the workspace \"([^\"]*)\" button$")
//	public void user_clicks_the_workspace_button(String keyDown) throws Throwable {
//		studyDefOBJ.clickProjectKeyDown(keyDown);
//
//	}
//
//}