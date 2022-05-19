package com.demoqatest.mypackage;

import com.base.mypackage.TestBase;
import com.demoqapages.mypackage.ElementsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Test;

public class DynamicPropertyTest extends DemoQaTestBase {


    @Test
    public void dynamicPropertyTest() {
        new NavigationPage(driver).clickOnElements();
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickDynamicProperties();
        elementsPage.checkButtonsAndText();
    }
}
