package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BasketPage;
import pages.General;
import utils.DriverFactory;

public class BasketPageStepDefs {
    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());
    General general = new General(DriverFactory.getDriver());

    @Then("check Product Name and Price on Basket Page")
    public void checkProductNameAndPriceOnBasketPage() {
        Assert.assertTrue(general.getTxtString().contains(basketPage.getProductName()), "Textler aynı değil");
        Assert.assertTrue(general.getTxtString().contains(basketPage.getProductPrice()), "Textler aynı değil");
    }

    @When("select Product Number {string} on Basket Page")
    public void selectProductNumberButton(String number) {
        basketPage.selectProductNumber(number);
    }

    @Then("should see Product Number {string} on Basket Page")
    public void shouldSeeProductNumberOnBasketPage(String number) {
        basketPage.checkProductNumber(number);
    }

    @When("click Delete button on Basket Page")
    public void clickDeleteButtonOnBasketPage() {
        basketPage.clickDeleteButton();
    }

    @Then("should see Empty Basket Message {string} on Basket Page")
    public void shouldSeeEmptyBasketMessageOnBasketPage(String message) {
        basketPage.checkEmptyMessage(message);
    }
}
