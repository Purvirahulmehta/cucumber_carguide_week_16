package com.carsguide.steps;


import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarSearchPage;
import com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyTest {




    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {

        new HomePage().clickOnSearchCarsTab();
    }



    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String text) {
        new NewAndUsedCarSearchPage().selectMake(text);

    }

    @And("^I select model\"([^\"]*)\"$")
    public void iSelectModel(String text) {
        new NewAndUsedCarSearchPage().selectModel(text);

    }

    @And("^I select location\"([^\"]*)\"$")
    public void iSelectLocation(String text) {
        new NewAndUsedCarSearchPage().selectLocation(text);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String text) {
        new NewAndUsedCarSearchPage().selectPrice(text);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyCarTab();

    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String arg0) {
        Assert.assertTrue(arg0,new ResultPage().verifyMakeTitleMessage().contains(arg0));

    }


    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarsTab();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage(String text) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Page not Found",text,new NewAndUsedCarSearchPage().verifyTitleHeader());
    }

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String text) throws Throwable {
      Assert.assertEquals("Page not found",text,new NewAndUsedCarSearchPage().verifyTitleHeader());
    }

    @When("^I mouse hover on 'buy\\+sell'tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHooverToBuySellTab();
    }
}
