package com.demoqatest.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;


public abstract class DemoQaTestBase extends TestBase {

    private static final String DEMOQA_URL = "https://demoqa.com";

    @BeforeEach
    public void beforeDemoQATest() {
        driver.get(DEMOQA_URL);
    }
}
