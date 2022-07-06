package com.demoqatest.mypackage;

import com.demoqapages.mypackage.NavigationPage;
import com.demoqapages.mypackage.ToolTipsPage;
import com.demoqapages.mypackage.WidgetPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WidgetTest extends DemoQaTestBase {

    @Test
    public void testWidget() {
        WidgetPage widgetPage = new NavigationPage(getDriver()).clickOnWidgets();
        ToolTipsPage toolTipsPage = widgetPage.clickToolTip();

        Assertions.assertEquals(toolTipsPage.checkToolTip(), "You hovered over the Button");
    }
}
