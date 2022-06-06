package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import Pages.HomePage;
import Framework.DriverSetup;
import org.testng.Assert;


public class HomePageSteps {

    HomePage homePage= new HomePage(DriverSetup.getDriver());

    @Given("User on home page")
    public void user_on_home_page() {
        homePage.isUserInHomePage();

    }

    @When("User clicks searchbox")
    public void user_clicks_searchbox() {

        homePage.clickSearchBox();
    }

    @When("User writes {string}")
    public void user_writes(String string) {

        homePage.writeProductName();

    }

    @When("User clicks home page Search Button")
    public void user_clicks_home_page_search_button() {

        homePage.clickHomePageSearchButton();

    }



    @When("User clicks Erkek checkbox button")
    public void user_clicks_erkek_checkbox_button() {

        homePage.getProductPage();
        homePage.setClickNowhere();
        homePage.clickCheckBox();

    }

    @Then("User should see {string} product")
    public void user_should_see_product(String product) {
        System.out.println(product);

        Assert.assertTrue(product.contains("Erkek Lacivert"));

    }

    @When("User clicks {string}")
    public void user_clicks(String string) {
        homePage.setProductName();

    }


    @When("User clicks Sepete Ekle button")
    public void userClicksButton() {
        homePage.getProductCartPage();
        homePage.setAddProductButton();
    }

    @When("User on cart page")
    public void user_on_cart_page() {

        homePage.getProduct();

    }

    @When("User clicks trash can icon")
    public void user_clicks_trash_can_icon() {
        
        homePage.clickTrashIcon();
    }

    @When("User clicks Sil button")
    public void user_clicks_sil_button() {
        homePage.setDeleteIcon();

    }

    @Then("Should see {string} empty cart message.")
    public void should_see_empty_cart_message(String string) {
        homePage.setEmptyCartMessage();
    }
}
