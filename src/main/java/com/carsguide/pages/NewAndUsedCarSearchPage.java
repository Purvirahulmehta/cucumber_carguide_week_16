package com.carsguide.pages;


import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log= LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());
    public NewAndUsedCarSearchPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='heading main-heading item-ad-wrapper ']/h1")
    WebElement newAndUsedCarSearchText;
    @CacheLookup
    @FindBy(xpath ="//select[@id='makes']")
    WebElement carMake;
    @CacheLookup
    @FindBy(xpath ="//select[@id='models']")
    WebElement carModel;
    @CacheLookup
    @FindBy(xpath ="//select[@id='locations']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath ="//select[@id='priceTo']")
    WebElement carPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;

public String verifyTitleHeader(){
    log.info("Getting New & Used Car Search: " + newAndUsedCarSearchText.toString());
    return getTextFromElement(newAndUsedCarSearchText);
}
public void selectMake(String make){
    selectByVisibleTextFromDropDown(carMake,make);
    log.info("Click on Make: " + carMake.toString());
}
public void selectModel(String model){
    selectByVisibleTextFromDropDown(carModel,model);
    log.info("Click on Model: " + carModel.toString());
}
public void selectLocation(String text){
    selectByVisibleTextFromDropDown(location,text);
    log.info("Click on location: " + location.toString());

}
public void selectPrice(String price){
    selectByVisibleTextFromDropDown(carPrice,price);
    log.info("Click on price: " + carPrice.toString());

}
public void clickOnFindMyCarTab(){
    clickOnElement(findMyNextCarTab);
    log.info("Click on Find My Next Car Tab: " + findMyNextCarTab.toString());
}


}
