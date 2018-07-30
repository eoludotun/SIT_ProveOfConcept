package com.test_StepsFolder;
//package test_StepsFolder;
//
//import cucumber.api.java.en.When;
//import pageObjectHelper.Constant;
//import testHooks_Utility.TestConfigUtility;
//import webServicesUtils.ServiceRequests;
//
//public class ServiceCallTest extends TestConfigUtility  {
//	private static ServiceRequests serviceOjb  = new ServiceRequests();
//
//
//
//	@When("^User sends a POST request to the Study Defination Web Service to create a workspace$")
//	public void user_sends_a_POST_request_to_the_Study_Defination_Web_Service_to_create_a_workspace() throws Throwable {	
//		 String randomClientName = faker.name();
//		 String randomProtocolName = faker.name();
//		serviceOjb.createWorkSpacePostRequest(Constant.STUDY_API, randomClientName, randomProtocolName);
//
//	}
//	
//	@When("^User sends a GET a get request to Study Defination Web Service$")
//	public void user_sends_a_GET_a_get_request_to_Study_Defination_Web_Service() throws Throwable {
//		log().info(serviceOjb.sendGetRequest(Constant.STUDY_API));
//	}
//}
//
