package com.webshoppages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickElement;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

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

        //proceed to checkout
        new ClickElement().clickElement("[title='Proceed to checkout'] > span", driver);
        new ClickElement().clickElement(".standard-checkout > span", driver);
    }

    public void verifyDataFromOrder() {

        String colorAndSizeToCompare = "Blue, M";
        String quantityToCompare = "2";
        WebElement colorAndSize = driver.findElement(By.id("layer_cart_product_attributes"));
        String cs = colorAndSize.getAttribute("innerText");
        WebElement quantity = driver.findElement(By.cssSelector("#layer_cart_product_quantity"));
        String q = quantity.getText();

        Assertions.assertEquals(colorAndSizeToCompare, cs, "The color does not match the requirements");
        Assertions.assertEquals(quantityToCompare, q, "The quantity does not match the requirements");
    }

    public void checkSignInLoaded() {
        WebElement signIn = driver.findElement(By.cssSelector(".step_current > span"));
        String str = signIn.getAttribute("background");
        String str1 = "";
    }
}
