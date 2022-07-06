package com.webshoptests.mypackage;

import com.webshoppages.mypackage.BlousePopupPage;
import com.webshoppages.mypackage.SearchPage;
import com.webshoppages.mypackage.WebShopPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchForBlouseTest extends WebShopTestBase {

    private static final String STRING_BLOUSE = "Short sleeved blouse with feminine draped sleeve detail.";

    @Test
    public void searchForWord() {
        SearchPage blousePage = new WebShopPage(getDriver()).searchForSomething(whatToSearch);
        BlousePopupPage blousePopupPage = blousePage.hoverAndClickQuickView();

        Assertions.assertEquals(STRING_BLOUSE, blousePopupPage.checkDescription(), "The desired message does not appear in the description!");
    }
}
