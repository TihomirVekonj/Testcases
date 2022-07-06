package com.webshoptests.mypackage;

import com.webshoppages.mypackage.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProductOrderTest extends WebShopTestBase {

    private static final String SIZE_TO_COMPARE = "M";
    private static final String QUANTITY_TO_COMPARE = "1";

    @Execution(ExecutionMode.CONCURRENT)
    @ParameterizedTest
    @ValueSource(strings = {"Orange", "Blue"})

    public void productOrderTest(String color) {
        final TshirtPage tShirtPage = new WebShopPage(getDriver()).clickTShirt();
        final TShirtPopupPage tShirtPopupPage = tShirtPage.SelectTShirt();

        final OrderDataVerificationPopupPage orderDataVerificationPopupPage = tShirtPopupPage.setOrderParameters(color);
        Assertions.assertEquals(QUANTITY_TO_COMPARE, orderDataVerificationPopupPage.verifyQuantity(), "The quantity does not match the requirements");
        Assertions.assertEquals(color + ", " + SIZE_TO_COMPARE, orderDataVerificationPopupPage.verifyColorAndSize(), "The color does not match the requirements");

        final CheckoutPage checkoutPage = orderDataVerificationPopupPage.proceedToCheckout();
        Assertions.assertEquals("Color : " + color + ", Size : " + SIZE_TO_COMPARE, checkoutPage.verifyDataFromTable(), "The color and the size do not match the requirements from the table");
        checkoutPage.proceedToCheckout();

        Assertions.assertTrue(checkoutPage.checkIfSignInLoaded(), "The sign in page didn't load");
    }
}
