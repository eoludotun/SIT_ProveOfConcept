package com.test_PageObjectsModel;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjectHelper.Driver;

public class SearchGooglePage extends Driver{



    public SearchGooglePage(){

        super(aDriver);

       

    }

    public String searchPageTitle(){

    new WebDriverWait(aDriver, 2L)
                .until(ExpectedConditions.titleContains(""));
        return aDriver.getTitle();

    }


    public void  searchKeyword(String keyword) throws Exception{
    	
//    	WebElement searchBox = pageWeBElement(By.name("q"));
//      
////    	 log().error(searchBox.getAttribute("value"));
//            searchBox.sendKeys(keyword, Keys.ENTER);         	
//    


            
            
    		String temp=null;
    		/**
    		 * Retrieve the List of Items in the Table before Sorting and Store into Array
    		 */
    		List<WebElement> tdList = pageWeBElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
    				
    		String strArray[] = new String[tdList.size()];
    		for(int i =0;i<tdList.size();i++)
    		{
    			System.out.println(tdList.get(i).getText());
    			strArray[i]=tdList.get(i).getText();
    		}
    		/**
    		 * Sort the Array by Swapping the Elements
    		 */
    		for (int i = 0; i < strArray.length; i++) 
    		{
    			for (int j = i + 1; j < strArray.length; j++) 
    			{
    				if (strArray[i].compareTo(strArray[j])>0) 
    				{
    					temp = strArray[i];
    					strArray[i] = strArray[j];
    					strArray[j] = temp;
    				}
    			}
    		}
    		/**
    		 * Printing the Values after sorting
    		 */
    		System.out.println("##################Sorted values in the Array####################");
    		for (int i = 0; i < strArray.length; i++) 
    		{
    		 
    					System.out.println(strArray[i]);
    		 }
     
    		/**
    		 * Click on Sort button and fetch the List
    		 */
    		pageWeBElement(By.xpath("//button[text()='Sort']")).click();
    		//driver.findElement(By.xpath("//button[text()='Sort']")).click();
    		tdList =  pageWeBElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
    				
    		/**
    		 * After Sorting printing the values in the List
    		 */
    		System.out.println("#################After Sorting Printing the Values from the List###################");
    		for (int i = 0; i < strArray.length; i++) 
    		{
    		 
    					System.out.println(tdList.get(i).getText());
    		 }
    		/**
    		 * Comparison between the List and Sorted Array
    		 */
    		boolean result = true;
    		for(int i =0;i<strArray.length;i++)
    		{
    			System.out.println(strArray[i]+"###"+tdList.get(i).getText());
    			if(strArray[i].compareTo(tdList.get(i).getText())!=0)
    			{
     
    				result = false;
    				System.out.println("Elements in the table are not sorted ");
    				break;
    			}
    		}
    		System.out.println("Elements in the dynamic table are sorted::"+ result);  
    	}
     
    

}
