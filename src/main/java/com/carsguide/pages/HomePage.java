package com.carsguide.pages;


import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='uhf-child-content']//a[contains(text(),'Used')]")
    WebElement usedCars;
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Search Cars')]")
    WebElement searchCarLink;

    public void mouseHooverToBuySellTab(){
        mouseHoverToElement(buySellTab);
        log.info("Mouse hoover to Buy & Sell Tab: " + buySellTab.toString());
    }
    public void clickOnSearchCarsTab(){
        clickOnElement(searchCarLink);
        log.info("Click on Search Cars Tab: " + searchCarLink.toString());
    }
    public void clickOnUsedCarsTab(){
        clickOnElement(usedCars);
        log.info("Click on Used Cars Tab: " + usedCars.toString());
    }

}
