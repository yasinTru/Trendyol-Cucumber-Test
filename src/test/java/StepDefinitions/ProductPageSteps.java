package StepDefinitions;

import Pages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Framework.DriverSetup;

public class ProductPageSteps {

    ProductPage productPage= new ProductPage(DriverSetup.getDriver());

/*
    @Given("User on cart page")
    public void user_on_cart_page() {

        productPage.getProduct();

    }

    @When("User clicks trash can icon")
    public void user_clicks_trash_can_icon() {
        productPage.clickTrashIcon();
    }

    @When("User clicks Sil button")
    public void user_clicks_sil_button() {

    }

    @Then("Should see {string} empty cart message.")
    public void should_see_empty_cart_message(String string) {

    }
*/
}
