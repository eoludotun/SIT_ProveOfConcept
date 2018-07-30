package com.pageObjectHelper;






public class URLUtility extends Driver{

    public URLUtility(){
        super(aDriver);
    }

    public URLUtility goToGoogleURL() {
       aDriver.navigate().to(Constant.MAGICAL_APP_Url);
       log().info("Google_Url is: " + Constant.MAGICAL_APP_Url);
       return new URLUtility();
    }

    public String pageTitle(){
        String pageTitle = aDriver.getTitle();
        return pageTitle;
    }
}

