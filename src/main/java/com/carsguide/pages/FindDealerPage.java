package com.carsguide.pages;


import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindDealerPage extends Utility {
    private static final Logger log= LogManager.getLogger(FindDealerPage.class.getName());
    public FindDealerPage(){

        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Find a Dealer')]")
    WebElement findADealer;
    @CacheLookup
    @FindBy(xpath ="//div[@class='dealerListing--name']/a")
   List<WebElement>  dealerList;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Next')]")
    WebElement nextButton;
    public void clickOnFindADealer(){
        clickOnElement(findADealer);
        log.info("Click on Find A Dealer Tab: " + dealerList.toString());

    }
    public String gettingNameOfDealer(String text){
        for(WebElement data : dealerList){
            String str = data.getText();
            if(str.equalsIgnoreCase(text)){
                return str;
            }
        }
        return null;

    }
    public void clickOnNextButton(){
        clickOnElement(nextButton);
    }
}
