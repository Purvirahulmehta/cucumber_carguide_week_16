package com.carsguide.steps;


import com.carsguide.pages.FindDealerPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DealerTest {
    @And("^I click 'Find a Dealer' link$")
    public void iClickFindADealerLink() {
        new FindDealerPage().clickOnFindADealer();
    }

    @Then("^I see the dealer lists$")
    public void iSeeTheDealerLists(DataTable datatable) {
        List<String> expectedList=datatable.asList(String.class);
        for(String data: expectedList){
            while ((new FindDealerPage().gettingNameOfDealer(data)==null)){
                new FindDealerPage().clickOnNextButton();

            }
            Assert.assertEquals("Dealer name is not available" ,data,new FindDealerPage().gettingNameOfDealer(data));
        }


    }
}
