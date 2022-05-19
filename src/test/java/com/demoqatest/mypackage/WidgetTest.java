package com.demoqatest.mypackage;

import com.demoqapages.mypackage.NavigationPage;
import com.demoqapages.mypackage.WidgetPage;
import org.junit.jupiter.api.Test;


public class WidgetTest extends DemoQaTestBase {

    @Test
    public void testWidget() {
        new NavigationPage(driver).clickOnWidgets();
        WidgetPage widgetPage = new WidgetPage(driver);
        widgetPage.clickToolTip();
        widgetPage.checkToolTip();

    }
}
