package com.demoqatest.mypackage;

import com.demoqapages.mypackage.DynamicPropertyPage;
import com.demoqapages.mypackage.ElementsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DynamicPropertyTest extends DemoQaTestBase {

    private static final String RANDOM_TEXT_TO_CHECK = "This text has random Id";

    @Test
    public void dynamicPropertyTest() {

        final ElementsPage elementsPage = new NavigationPage(getDriver()).clickOnElements();
        final DynamicPropertyPage dynamicPropertyPage = elementsPage.clickDynamicProperties();

        Assertions.assertEquals(RANDOM_TEXT_TO_CHECK, dynamicPropertyPage.checkText(), "Error! The desired text is nowhere to be found");
        Assertions.assertTrue(dynamicPropertyPage.checkVisibilityOfButton(), "The desired button is not visible!");
        Assertions.assertTrue(dynamicPropertyPage.checkColorChangeButton(), "The button did not change colors!");
        Assertions.assertTrue(dynamicPropertyPage.checkEnableButton(), "The desired button is not enabled");
    }
}
