package com.demoqatest.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;


public abstract class DemoQaTestBase extends TestBase {

    private static final String DEMO_QA_URL = "https://demoqa.com";

    @BeforeEach
    @Disabled
    public void beforeDemoQATest() {
        driver.get(DEMO_QA_URL);
    }
}
