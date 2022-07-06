package com.webshoppages.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends WebShopBasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

        public String verifyDataFromTable() {
        return driver.findElement(By.cssSelector(".cart_description > small:nth-of-type(2)")).getText();
    }

    public void proceedToCheckout() {
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    }

    public Boolean checkIfSignInLoaded() {
        return driver.findElement(By.cssSelector("#SubmitCreate > span")).isDisplayed();
    }
}
