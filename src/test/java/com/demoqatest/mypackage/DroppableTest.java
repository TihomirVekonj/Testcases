package com.demoqatest.mypackage;

import com.demoqapages.mypackage.InteractionsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Test;

public class DroppableTest extends DemoQaTestBase {

    @Test
    public void dragAndDropTest() {
        new NavigationPage(driver).clickOnInteractions();
        InteractionsPage interactionsPage = new InteractionsPage(driver);
        interactionsPage.clickDroppable();
        interactionsPage.dragAndDropCheck();
    }
}
