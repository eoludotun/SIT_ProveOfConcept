package com.testHooks_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.fluttercode.datafactory.impl.DataFactory;
import org.json.JSONObject;
import org.junit.Assert;
import org.yaml.snakeyaml.Yaml;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import gherkin.formatter.model.Scenario;

public class TestConfigUtility {
	public static Scenario scenario;
	public String sessionId;
	public String exeBrowserName = System.getProperty("browserName");
	public String exePlatfom = System.getProperty("platform");
	private static Logger _logger;
	private Date date = new Date();  
	private SimpleDateFormat sdf = new SimpleDateFormat("dd, MM, yyyy"); 
	private static Random myRandom;
	protected Faker faker = new Faker();


	
	public static Scenario getScenario() {
		return scenario;
	}

	public TestConfigUtility() {
		// Empty constructor
	}

	public String  getFirstCharacter(String firstLetter) throws Exception {

	        int space;        // The location of the space in the input.
	        String firstName; // The first name, extracted from the input.
	        @SuppressWarnings("unused")
			String lastName;  // The last name, extracted from the input.

	        space = firstLetter.indexOf(' ');
	        firstName = firstLetter.substring(0, space);
	        lastName = firstLetter.substring(space+1);
	        char firstletter = firstName.charAt(0);
	        String convertToString = Character.toString(firstletter);
	        
	        log().info("Your first letter is " + firstletter);
//	        log().info("Your lastName initials are " + firstName.charAt(0));		
		return convertToString;

	}

	public void cleanUp(Scenario scenario) throws InterruptedException {
	}
	
	public void pause(Integer milliseconds){
	    try {
	        TimeUnit.MILLISECONDS.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	public Object  loadYAML_Data(String path)throws IOException {

		log().info("YAML path is : " + System.getProperty("user.dir")+path);
//		YamlReader reader = new YamlReader(new FileReader(System.getProperty("user.dir")+"/src/main/resources/DataFolder/"+path));
		YamlReader reader = new YamlReader(new FileReader(System.getProperty("user.dir")+path));
		Object object = reader.read();
		log().info("YAML data is : "+object);
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public Object convertJsonToMAP(String path) throws IOException {
		byte[] mapData = Files.readAllBytes(Paths.get(path));
		Map<String,String> myMap = new HashMap<String, String>();

		ObjectMapper objectMapper = new ObjectMapper();
		myMap = objectMapper.readValue(mapData, HashMap.class);
		log().info("Json Map Data is: "+ myMap);
		return myMap;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<String> itrateAndGetIndividualYaml_KeyValaue(String path,String individualYamlKeyValue) throws IOException {
//		log().info("yaml Value  " + loadYAML_Data(System.getProperty("user.dir")));
		 Map<String, ArrayList> yamlParsers = (Map<String, ArrayList>) loadYAML_Data(System.getProperty("user.dir")+"/src/main/resources/DataFolder/"+path);
		    
			ArrayList keyValueArraylist = (ArrayList) yamlParsers.get(individualYamlKeyValue);
			log().info("Final result  " + keyValueArraylist);	
			return keyValueArraylist;
	}
	
	public String  loadParseYAML_Data(String path)throws IOException {
		
		log().info("YAML path is : " + System.getProperty("user.dir") + path );
		Yaml yaml = new Yaml();
		
	            InputStream yamlData = new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/YAML_TestData_Folder/"+path));
	         
	             // Parse the YAML file and return the output as a series of Maps and Lists
	             @SuppressWarnings("unchecked")
				Map<String,Object> result = (Map<String,Object>)yaml.load(yamlData);
	            log().info("YAML result To String " + result.toString()); 
		return result.toString();
	
	   }
	
	public static ArrayList<String> createArrayList(String ... elements) {
		  ArrayList<String> list = new ArrayList<String>(); 
		  for (String element : elements) {
		    list.add(element);
		  }
		  log().info("Current YAML list result is " + list);
		  return list;
		}
	
	public static String convertToJson(String yamlString) {
	    Yaml yaml= new Yaml();
	    @SuppressWarnings("unchecked")
		Map<String,Object> map= (Map<String, Object>) yaml.load(System.getProperty("user.dir")+"/src/main/resources/YAML_TestData_Folder/"+yamlString);

	    JSONObject jsonObject=new JSONObject(map);
	    return jsonObject.toString();
	}
	
	@SuppressWarnings("unchecked")
	public String  getTestKeyDataValue(String yamlString, String key)throws IOException {		
		final String fileName = System.getProperty("user.dir")+"/src/main/resources/DataFolder/"+yamlString;
	      Yaml yaml = new Yaml();
	     
	         InputStream loadFile = new FileInputStream(new File(fileName)); 
	         // Parse the YAML file and return the output as a series of Maps and Lists
	         Map<String,Object> result = (Map<String,Object>)yaml.load(loadFile);
	         log().info("Test key value is : " + result.get(key).toString());         
		return result.get(key).toString();
	}
		
	 //Singleton Logger
    public static Logger log()
    {
    	if(_logger == null)
    		_logger = LogManager.getLogger();
    	return _logger;
    }

	public boolean checkMatchingValues(Object actualValue, Object expectedValue) {
        String successMessage = "\t* The Expected and Actual Values match. (PASS)\n";
        String failureMessage = "\t* The Expected and Actual Values do not match! (FAIL)\n";

        boolean doValuesMatch = false;

        log().info("\t* Expected Value: " + expectedValue);
        log().info("\t* Actual Value: " + actualValue);

        if (actualValue.equals(expectedValue)) {
        	log().info(successMessage);
        	Assert.assertEquals(actualValue, expectedValue);
            doValuesMatch = true;
            Assert.assertTrue(doValuesMatch);
        } else {
        	log().info(failureMessage);
            doValuesMatch = false;
            Assert.assertTrue(doValuesMatch);
        }
        return doValuesMatch;
    }
	public String getCollectionDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, -1);
		date = cal.getTime();
		String dateString = sdf.format(date); 
		sdf = new SimpleDateFormat("ddMMMyyyy");  
	    dateString = sdf.format(date);  
	    log().info("Date in the format is: "+dateString);
	    return dateString;
	}
	public String getCurrentDate() {
		String dateString = sdf.format(date); 
		sdf = new SimpleDateFormat("ddMMMyyyy");  
	    dateString = sdf.format(date);  
	    log().info("Date in the format is: "+dateString);
	    return dateString;
	}
	
    public String RandomPhoneNumber()
    {
        String tempString = "";
        for (int i = 0; i < 3; i++)
        {
            tempString = tempString + myRandom.nextInt(10);
        }
        tempString = tempString + '-';
        for (int i = 0; i < 3; i++)
        {
            tempString = tempString + myRandom.nextInt(10);
        }
        tempString = tempString + '-';
        for (int i = 0; i < 4; i++)
        {
            tempString = tempString + myRandom.nextInt(10);
        }
        return tempString;
    }
	
    private static String[] WordArr =
        {
            "document", "the", "a", "is", "and", "but", "where", "law",
            "brown", "cat", "mouse", "let", "will", "way", "judge",
             "run", "cheese", "milk", "save", "meat", "potato",
             "sue", "papers", "pictures", "mom", "dad", "pound",
             "kilo", "road", "cover", "use", "pop", "balloon", "clown",
              "charge", "pay", "red", "light", "bulb", "chair", "toss"
    };

    public String RandomText(int length)
    {
        int maxDo = 10000;

        if (length > maxDo)
        {
            String temp = RandomText(maxDo);
            while (temp.length() < length)
            {
                temp = temp + " " + temp;
            }
            if (temp.length() > length)
            {
                temp = temp.substring(0, length);
            }
            return temp;
        }
        int randomLength = 15;
        String tempString = RandomText(randomLength);
        while (tempString.length() < length)
        {
            if (length - tempString.length() > 10)
            {
                tempString += " " + WordArr[myRandom.nextInt(WordArr.length)];
            }
            else
            {
                tempString += " " + RandomText(20);
            }
        }
        tempString = tempString.substring(0, length);
        return tempString;
    }
    
    public String randomNameGenerator() {
    	DataFactory dataFac = new DataFactory();
		String randomName = dataFac.getFirstName() + " "+ dataFac.getLastName();
 
		return randomName; 	
    }
    
    public String generateRandomString(int length)
    {
    	  return RandomStringUtils.randomAlphabetic(length);
    }
    	 
    public String generateRandomNumber(int length)
    {
    	  return RandomStringUtils.randomNumeric(length);
    }
    	 
    public String generateRandomAlphaNumeric(int length)
    {
    	  return RandomStringUtils.randomAlphanumeric(length);
    }
    	 
    public String generateStringWithAllobedSplChars(int length,String allowdSplChrs)
    {
    	  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
    	    "1234567890" +   //numbers
    	    allowdSplChrs;
    	  return RandomStringUtils.random(length, allowedChars);
    }
    	 
    public String generateEmail(int length)
    {
    	  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
    	    "1234567890" +   //numbers
    	    "_-.";   //special characters
    	  String email="";
    	  String temp=RandomStringUtils.random(length,allowedChars);
    	  email=temp.substring(0,temp.length()-9)+"@automationtest.com";
    	  return email;
     }
    	 
    public String generateUrl(int length) 
    {
    	  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
    	    "1234567890" +   //numbers
    	    "_-.";   //special characters
    	  String url="";
    	  String temp=RandomStringUtils.random(length,allowedChars);
    	  url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
    	  return url;
    }  
}

