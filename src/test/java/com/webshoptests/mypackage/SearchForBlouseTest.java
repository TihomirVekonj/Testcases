package com.webshoptests.mypackage;

import com.webshoppages.mypackage.BlousePage;
import com.webshoppages.mypackage.WebshopPage;
import org.junit.jupiter.api.Test;

public class SearchForBlouseTest extends WebshopTestBase {

    @Test
    public void searchForBlouse() {
        new WebshopPage(driver).searchForBlouse();
        BlousePage blousePage = new BlousePage(driver);
        blousePage.hoverAndClickQuickView();
        blousePage.checkDescription();
    }
}
