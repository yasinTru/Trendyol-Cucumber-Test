package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;

import java.awt.*;
//import Framework.Helper;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By homePageSearchbox= By.cssSelector(".search-box");
    By closeCookieButton=By.id("Rating-Review");
    By isInHomePage= By.cssSelector(".homepage-wrapper .circled-slider");
    By homePageSearchButton=By.cssSelector(".search-icon");
    By selectFilter=By.cssSelector("div[class='sort-fltr-cntnr'] select");
    By manCheckBox= By.xpath("//div[normalize-space()='Erkek']");
    By clickNowhere= By.cssSelector(".overlay");
    By productName=By.xpath("//span[@title=\"Erkek Lacivert Kapitone Spor Mont\"]");
    By productContainer=By.cssSelector(".product-container");
    By addProductButton= By.cssSelector(".add-to-basket");
    By trashIcon= By.cssSelector(".pb-basket-item-actions .i-trash");
    By deleteIcon= By.xpath("//button[normalize-space()='Sil']");
    By emptyCartMessage=By.cssSelector(".pb-empty-basket");
    By cartIcon= By.cssSelector("a[class='link account-basket'] p[class='link-text']");




    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    public void isUserInHomePage()
    {
        driver.findElement(closeCookieButton).click();
        driver.findElement(isInHomePage).isDisplayed();
    }

    public void clickSearchBox()
    {
        driver.findElement(homePageSearchbox).click();

    }

    public void writeProductName()
    {
        driver.findElement(homePageSearchbox).sendKeys("mont");
    }

    public void clickHomePageSearchButton()
    {
        driver.findElement(homePageSearchButton).click();
    }

    public  void clickCheckBox()
    {
        driver.findElement(manCheckBox).click();

    }

    public void getProductPage()
    {
        driver.get("https://www.trendyol.com/sr?wc=118&qt=mont&st=mont&os=1");
    }

    public void setClickNowhere()
    {

        driver.findElement(clickNowhere).click();
    }

    public void setProductName()
    {
        driver.findElement(productName).click();
    }


    public void getProductCartPage()
    {
        driver.get("https://www.trendyol.com/kigili/erkek-lacivert-kapitone-spor-mont-p-140055065?boutiqueId=607615&merchantId=294");
    }
    public void setAddProductButton()
    {

        driver.findElement(addProductButton).click();
    }

    public void getProduct()
    {
       // driver.navigate().to("https://www.trendyol.com/sepet");
        driver.findElement(cartIcon).click();

    }

    public void clickTrashIcon()
    {

        driver.findElement(trashIcon).click();
    }

    public void setDeleteIcon()
    {
        driver.findElement(deleteIcon).click();
    }

    public void setEmptyCartMessage()
    {
        driver.findElement(emptyCartMessage);
    }


}
