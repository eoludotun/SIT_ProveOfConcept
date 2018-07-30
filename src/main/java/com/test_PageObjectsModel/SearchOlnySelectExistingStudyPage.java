//package com.test_PageObjectsModel;
//
//import org.openqa.selenium.By;
//
//import com.pageObjectHelper.Driver;
//
//public class SearchOlnySelectExistingStudyPage extends Driver{
//
//
//
//    public SearchOlnySelectExistingStudyPage(){
//        super(aDriver);
//    }
//        
//        
//        public void submitProtocolTxt(String protocol) throws Exception { 	
//        	pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).sendKeys(protocol);
//    	 
//        }
//        
//        public String validatepartialMatchesKeyWord() throws Exception{ 	
//        	String searchPartialMatch = pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText();
//    		return searchPartialMatch;    	 
//        }  
//        
//        public String validatepartialMsg() throws Exception{ 	
//        	String displayMsg = pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText();
//    		return displayMsg;    	 
//        }  
//        
//        public void submitProductTxt(String product) throws Exception{
//        	pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).sendKeys(product);
//        	
//        }
//    
//}
