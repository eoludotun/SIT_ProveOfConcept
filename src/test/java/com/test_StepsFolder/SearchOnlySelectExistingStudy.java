package com.test_StepsFolder;
//package test_StepsFolder;
//
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import testHooks_Utility.TestConfigUtility;
//import test_PageObjectsModel.SearchOlnySelectExistingStudyPage;
//
//public class SearchOnlySelectExistingStudy extends TestConfigUtility  {
//	
//	
//	private static SearchOlnySelectExistingStudyPage searchSelectionOBJ = new SearchOlnySelectExistingStudyPage(); 
//
//
//
//	@When("^User submit text representing a protocol name = \"([^\"]*)\" to search for existing protocols$")
//	public void user_submit_text_representing_a_protocol_name_to_search_for_existing_protocols(String protocol) throws Throwable {
//		log().info("OPS!! : Not impleted Yet");
//		searchSelectionOBJ.submitProtocolTxt(protocol);
//	}
//
//	@Then("^Validate the exact or partial matches = \"([^\"]*)\" are presented for selection$")
//	public void validate_the_exact_or_partial_matches_are_presented_for_selection(String expectedProduct) throws Throwable {
//		log().info("OPS!! : Not impleted Yet");
//		String actualProduct = searchSelectionOBJ.validatepartialMatchesKeyWord();
//		checkMatchingValues(actualProduct, expectedProduct);
//	}
//
//	@When("^User submit an  = \"([^\"]*)\" text protocol name or project number$")
//	public void user_submit_an_text_protocol_name_or_project_number(String product) throws Throwable {
//		log().info("OPS!! : Not impleted Yet");
//		searchSelectionOBJ.submitProductTxt(product);
//	}
//
//	@Then("^Validate a visual message indicates = \"([^\"]*)\" displays$")
//	public void validate_a_visual_message_indicates_displays(String expectedMsg) throws Throwable {
//		log().info("OPS!! : Not impleted Yet");
//		String actualMsg = searchSelectionOBJ.validatepartialMsg();
//		checkMatchingValues(actualMsg, expectedMsg);
//	}
//
//	@When("^User submit text representing a product number = \"([^\"]*)\" to search for existing projects$")
//	public void user_submit_text_representing_a_product_number_to_search_for_existing_projects(String product) throws Throwable {
//		log().info("OPS!! : Not impleted Yet");
//		searchSelectionOBJ.submitProductTxt(product);
//
//	}
//
//}
//
