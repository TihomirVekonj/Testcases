package com.webshoptests.mypackage;

import com.webshoppages.mypackage.TshirtPage;
import com.webshoppages.mypackage.WebshopPage;
import org.junit.jupiter.api.Test;

public class ProductOrderTest extends WebshopTestBase {

    @Test
    public void productOrderTest() {
        new WebshopPage(driver).clickTshirts();
        TshirtPage tshirtPage = new TshirtPage(driver);
        tshirtPage.selectProduct();
        tshirtPage.verifyDataFromOrder();
    }
}
