//package com.test_PageObjectsModel;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import com.pageObjectHelper.Driver;
//
//public class CreateWorkSpacePage extends Driver{
//
//    public CreateWorkSpacePage(){
//        super(aDriver);
//    }
//
//    public WebElement validateDefineWorkSpace() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")); 
//    }
//    
//    public void clickCreateNewWorkSpace(String createNew) throws Exception { 	
//    	pageWeBElement(By.xpath("//button[@routerlink='/define-workspace/2']//span[contains(text(),'"+createNew+"')]")).click(); 
//    }
//    
//    public void typeClientNameCreateNewWorkSpace(String clientName, String protocolName ) throws Exception { 	
//    	pageWeBElement(By.xpath("//input[@formcontrolname='clientName']")).sendKeys(clientName);
//    	pageWeBElement(By.xpath("//input[@formcontrolname='protocolName']")).sendKeys(protocolName);
//    }
//    
//    public void typeClientNameCreateNewWorkSpaceValidateAutoComplete(String clientName) { 	
//    	
//    	try {
//    		
//    	WebElement autoOptions = pageWeBElement(By.xpath("//input[@formcontrolname='clientName']"));
//    	autoOptions.sendKeys(clientName);
//		List<WebElement> optionsToSelect = autoOptions.findElements(By.id("mat-autocomplete-6"));
//		for(WebElement option : optionsToSelect){
//	        if(option.getText().equals(clientName)) {
//	        	System.out.println("Trying to select: "+clientName);
//	            option.click();
//	            break;
//	        }
//		}  
//		
//	} catch (NoSuchElementException e) {
//		System.out.println(e.getStackTrace());
//	}
//	catch (Exception e) {
//		System.out.println(e.getStackTrace());
//	}
//    }
//
//    public void clickSaveWorkSpace(String save) throws Exception { 	
//    	pageWeBElement(By.xpath("//button[@type='submit']//span[contains(text(),'"+save+"')]")).click(); 
//    }
//    
//    public void fillWorkSpaceData(String clientName, String protocolName) throws Exception {
//    	pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).sendKeys(clientName);
//    	pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).sendKeys(protocolName);	
//    }
//    
//    public String validatClientName() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText(); 
//    }
//    
//    public String validatProtocolName() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText(); 
//    }
//    
//    public String validatCurrentUser() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText(); 
//    }
//    
//    public String validatTimeStamp() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText(); 
//    }
//    
//    public String validatSelectorProtocol() throws Exception { 	
//    	return pageWeBElement(By.xpath("//div[@class='breadcrumb']//div")).getText(); 
//    }
//      
//}
