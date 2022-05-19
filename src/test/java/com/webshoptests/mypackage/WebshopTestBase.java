package com.webshoptests.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

public abstract class WebshopTestBase extends TestBase {

    private static final String WEBSHOP_URL = "http://automationpractice.com";

    @BeforeEach
    public void beforeWebShopTest() {
        driver.get(WEBSHOP_URL);
    }
}

