package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By trashIcon= By.cssSelector(".i-trash");


    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    public void getProduct()
    {
        driver.get("https://www.trendyol.com/sepet");

    }

    public void clickTrashIcon()
    {
        driver.findElement(trashIcon).click();
    }

}
