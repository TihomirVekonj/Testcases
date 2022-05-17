package com.tests.mypackage;

import com.base.mypackage.TestBase;
import com.demoqapages.mypackage.NavigationPage;
import com.demoqapages.mypackage.WidgetPage;
import org.junit.jupiter.api.Test;


public class WidgetTest extends TestBase {

    @Test
    public void testWidget() {
        new NavigationPage(driver).clickOnWidgets();
        WidgetPage widgetPage = new WidgetPage(driver);
        widgetPage.clickToolTip();
        widgetPage.checkToolTip();

    }
}
