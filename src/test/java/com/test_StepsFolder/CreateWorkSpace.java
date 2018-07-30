package com.test_StepsFolder;
//package test_StepsFolder;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import testHooks_Utility.TestConfigUtility;
//import test_PageObjectsModel.CreateWorkSpacePage;
//import test_PageObjectsModel.ValidateStudyDefMainPage;
//
//
//public class CreateWorkSpace  extends TestConfigUtility  {
//	private static CreateWorkSpacePage createWorkSpace = new CreateWorkSpacePage();
//	private static ValidateStudyDefMainPage studyDefOBJ = new ValidateStudyDefMainPage();
//
//
//
//	
//	@When("^clicks the \"([^\"]*)\" to create a workspace$")
//	public void clicks_the_to_create_a_workspace(String createNew) throws Throwable {
//		createWorkSpace.clickCreateNewWorkSpace(createNew);
//		
//	}
//	
//	@When("^User typed \"([^\"]*)\" Client Name together with \"([^\"]*)\" Protocol Name$")
//	public void user_typed_Client_Name_together_with_Protocol_Name(String clientName, String protocolName) throws Throwable {
//		createWorkSpace.typeClientNameCreateNewWorkSpace(clientName, protocolName);		
//	}
//	
//	@When("^User clicks the \"([^\"]*)\"$")
//	public void user_clicks_the(String workSpace) throws Throwable {
//		studyDefOBJ.validateWorkSpace(workSpace).click();
//		Thread.sleep(30003);
//	}
//
//	@Then("^Validate the Client Name = \"([^\"]*)\"$")
//	public void validate_the_Client_Name(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User clicks \"([^\"]*)\" button on the create workspace page$")
//	public void user_clicks_button_on_the_create_workspace_page(String save) throws Throwable {
//		createWorkSpace.clickSaveWorkSpace(save);
//		
//	}
//	
//	@When("^User initiated a Define Workspace flow$")
//	public void user_initiated_a_Define_Workspace_flow() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^Validate user is on the Define page work space$")
//	public void validate_user_is_on_the_Define_page_work_space() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//	
//	@When("^User fill unsuppported to create workspace$")
//	public void user_fill_unsuppported_to_create_workspace() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^Validate error message are display$")
//	public void validate_error_message_are_display() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@When("^User fill the requirement data for creating a WorkSpace$")
//	public void user_fill_the_requirement_data_for_creating_a_WorkSpace() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions	
//	    String randomClientName = faker.name();
//	    String randomProtocolName = faker.name();
//	    createWorkSpace.fillWorkSpaceData(randomClientName, randomProtocolName);
//	    throw new PendingException();    
//	}
//	
//	@Then("^Validate workspace is successfully created$")
//	public void validate_workspace_is_successfully_created() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^Validate a new workspace is created with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
//	public void validate_a_new_workspace_is_created_with(String expectedclientName, String expectedProtocolName, String expectedCurrentUser, String expectedTimeStamp) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		checkMatchingValues(createWorkSpace.validatClientName(), expectedclientName);
//		checkMatchingValues(createWorkSpace.validatProtocolName(), expectedProtocolName);
//		checkMatchingValues(createWorkSpace.validatCurrentUser(), expectedCurrentUser);
//		checkMatchingValues(createWorkSpace.validatTimeStamp(), expectedTimeStamp);
//	    throw new PendingException();
//	}
//
//	@Then("^User can navigate to the \"([^\"]*)\"$")
//	public void user_can_navigate_to_the(String arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//
//	@Then("^Validate user is presented with the \"([^\"]*)\"$")
//	public void validate_user_is_presented_with_the(String expectedProtocolSelector) throws Throwable {
//		checkMatchingValues(createWorkSpace.validatSelectorProtocol(), expectedProtocolSelector);
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
//}