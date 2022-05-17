package com.tests.mypackage;

import com.base.mypackage.TestBase;
import com.demoqapages.mypackage.InteractionsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Test;

public class DroppableTest extends TestBase {


    @Test
    public void dragAndDropTest() throws InterruptedException {
        new NavigationPage(driver).clickOnInteractions();
        InteractionsPage interactionsPage = new InteractionsPage(driver);
        interactionsPage.clickDroppable();
        interactionsPage.dragAndDropCheck();
    }
}
