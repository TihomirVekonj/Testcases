package com.webshoppages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickElement;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TshirtPage extends BasePage {

    public TshirtPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct() {
        //click product
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement product = driver.findElement(By.cssSelector("[alt='Faded Short Sleeve T-shirts']"));
        new ClickIfElementCovered().clickElementWait(product,driver);

        //select size
        new ClickElement().clickElement(".form-control",driver);
        new ClickElement().clickElement("[value='2']",driver);

        //set color
        new ClickElement().clickElement("[name='Blue']", driver);

        //set quantity
        new ClickElement().clickElement(".icon-plus",driver);

        //add to cart
        new ClickElement().clickElement("[name='Submit'] > span",driver);
    }

    public void verifyDataFromOrder() {

        String colorAndSizeToCompare = "Blue, M";
        String quantityToCompare = "2";
        String colorAndSize = driver.findElement(By.cssSelector("#layer_cart_product_attributes")).getText();
        String quantity = driver.findElement(By.cssSelector("#layer_cart_product_quantity")).getText();

//        Assertions.assertEquals(colorAndSizeToCompare, colorAndSize, "The color does not match the requirements");
        Assertions.assertEquals(quantityToCompare, quantity, "The quantity does not match the requirements");
    }
}
