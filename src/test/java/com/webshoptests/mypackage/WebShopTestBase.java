package com.webshoptests.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;


public abstract class WebShopTestBase extends TestBase {

    public static String whatToSearch = System.getProperty("search");
    private static final String WEB_SHOP_URL = "http://automationpractice.com";

    @BeforeEach
    public void beforeWebShopTest() {
        getDriver().get(WEB_SHOP_URL);
    }
}

