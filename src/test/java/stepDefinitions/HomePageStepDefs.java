package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.General;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageStepDefs {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());

    @Given("user on the Home Page")
    public void userOnTheHomePage() {
        homePage.checkHomePage();
        homePage.acceptCookies();
        homePage.selectGencer("ERKEK");
    }

    @When("sendkeys SearchBox {string} on Home Page")
    public void sendkeysSearchBoxOnHomePage(String search) {
        homePage.sendKeysSearchBox(search);
    }

    @And("clear SearchBox on Home Page")
    public void clearSearchBoxOnHomePage() {
        homePage.clearSearchBox();
    }

    @When("click SearchBox on Home Page")
    public void clickSearchBocOnHomePage() {
        homePage.clickSearchBox();
    }

    @When("sendkeys SearchBox First Cell on Home Page")
    public void sendkeysSearchBoxFirstCellOnHomePage() {
        String search = general.getCell("sheet", 1, 1);
        homePage.sendKeysSearchBox(search);
    }

    @And("sendkeys SearchBox Second Cell on Home Page")
    public void sendkeysSearchBoxSecondCellOnHomePage() {
        String search = general.getCell("sheet", 2, 1);
        homePage.sendKeysSearchBox(search);
    }
}
