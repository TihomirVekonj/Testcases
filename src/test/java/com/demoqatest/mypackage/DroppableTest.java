package com.demoqatest.mypackage;

import com.demoqapages.mypackage.DroppablePage;
import com.demoqapages.mypackage.InteractionsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class DroppableTest extends DemoQaTestBase {

    private static final String DRAG_AND_DROP_BG_COLOR = "#4682b4";

    @Test
    @Disabled
    public void dragAndDropTest() {

        InteractionsPage interactionsPage = new NavigationPage(getDriver()).clickOnInteractions();
        final DroppablePage droppablePage = interactionsPage.clickDroppable();

        Assertions.assertEquals(DRAG_AND_DROP_BG_COLOR, droppablePage.dragAndDropCheck(), "Error! The droppable window is not steel-blue!");
    }
}
