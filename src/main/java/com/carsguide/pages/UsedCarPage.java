package com.carsguide.pages;


import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log= LogManager.getLogger(UsedCarPage.class.getName());
    public UsedCarPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Used Cars For Sale')]")
    WebElement usedCarForSaleText;
    @CacheLookup
    @FindBy(xpath ="//select[@id='makes']")
    WebElement carMakeUsed;
    @CacheLookup
    @FindBy(xpath ="//select[@id='models']")
    WebElement carModelUsed;
    @CacheLookup
    @FindBy(xpath ="//select[@id='locations']")
    WebElement locationUsed;
    @CacheLookup
    @FindBy(xpath ="//select[@id='priceTo']")
    WebElement carPriceUsed ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='search-submit']")
    WebElement findMyNextCarTabUsed;

    public String verifyUsedCarForSale(){
        log.info("Getting Used Car Search: " + usedCarForSaleText.toString());
        return getTextFromElement(usedCarForSaleText);
    }
    public void selectMakeUsed(String make){
        selectByVisibleTextFromDropDown(carMakeUsed,make);
        log.info("Click on Make: " + carMakeUsed.toString());
    }
    public void selectModelUsed(String model){
        selectByVisibleTextFromDropDown(carModelUsed,model);
        log.info("Click on Model: " + carModelUsed.toString());
    }
    public void selectLocationUsed(String text){
        selectByVisibleTextFromDropDown(locationUsed,text);
        log.info("Click on location: " + locationUsed.toString());

    }
    public void selectPriceUsed(String price){
        selectByVisibleTextFromDropDown(carPriceUsed,price);
        log.info("Click on price: " + carPriceUsed.toString());

    }
    public void clickOnFindMyCarTabUsed(){
        clickOnElement(findMyNextCarTabUsed);
        log.info("Click on Find My Next Car Tab: " + findMyNextCarTabUsed.toString());
    }

}
