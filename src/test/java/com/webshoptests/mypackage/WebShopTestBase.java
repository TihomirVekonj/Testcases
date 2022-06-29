package com.webshoptests.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;


public abstract class WebShopTestBase extends TestBase {

    public static String color = System.getProperty("color");
    public static String size = System.getProperty("size");
    public static String quantity = System.getProperty("quantity");
    public static String whatToSearch = System.getProperty("search");
    private static final String DEFAULT_SEARCH = "blouse";
    private static final String WEB_SHOP_URL = "http://automationpractice.com";

    @BeforeEach
    public void beforeWebShopTest() {
        driver.get(WEB_SHOP_URL);
    }
}

