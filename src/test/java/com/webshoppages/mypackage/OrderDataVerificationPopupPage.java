package com.webshoppages.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderDataVerificationPopupPage extends WebShopBasePage {


    public OrderDataVerificationPopupPage(WebDriver driver) {
        super(driver);
    }

    public String verifyColorAndSize() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#layer_cart_product_attributes")));

        return driver.findElement(By.cssSelector("#layer_cart_product_attributes")).getAttribute("innerHTML");
    }

    public String verifyQuantity() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#layer_cart_product_attributes")));

        return driver.findElement(By.cssSelector("#layer_cart_product_quantity")).getText();
    }

    public CheckoutPage proceedToCheckout() {
        driver.findElement(By.cssSelector("[title='Proceed to checkout'] > span")).click();
        return new CheckoutPage(driver);
    }
}
