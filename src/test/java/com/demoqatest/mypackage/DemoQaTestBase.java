package com.demoqatest.mypackage;

import com.base.mypackage.TestBase;
import org.junit.jupiter.api.BeforeEach;

public abstract class DemoQaTestBase extends TestBase {

    private static final String DEMO_QA_URL = "https://demoqa.com";

    @BeforeEach
    public void beforeDemoQATest() {
        getDriver().get(DEMO_QA_URL);
    }
}
