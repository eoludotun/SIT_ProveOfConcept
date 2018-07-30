//package com.test_PageObjectsModel;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import com.pageObjectHelper.Driver;
//
//public class ValidateStudyDefMainPage extends Driver{
//
//
//
//    public ValidateStudyDefMainPage(){
//        super(aDriver);
//    }
//
//    public String studyDefinationKeyWord() throws Exception{ 	
//    	String searchBox = pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText();
//		return searchBox;    	 
//    }
//    
//    public void clickMenueOndashboard() throws Exception{
//    	 pageWeBElement(By.xpath("//button[@class='mat-icon-button']//span")).click();
//    }
//    
//    public void clickProjectKeyDown(String keyDown) throws Exception {
//    	pageWeBElement(By.xpath("//span[@class='mat-button-wrapper']//em[contains(text(),'"+keyDown+"')]")).click();
//
//    }
//    
//    public WebElement validateWorkSpace(String workSpace) throws Exception {
//    	return pageWeBElement(By.xpath("//div[@ng-reflect-layout='row']//span[contains(text(),'"+workSpace+"')]"));
//    }
//}
