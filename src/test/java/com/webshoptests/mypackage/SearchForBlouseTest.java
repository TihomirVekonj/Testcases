package com.webshoptests.mypackage;

import com.webshoppages.mypackage.BlousePopupPage;
import com.webshoppages.mypackage.SearchPage;
import com.webshoppages.mypackage.WebShopPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class SearchForBlouseTest extends WebShopTestBase {

    private static final String STRING_BLOUSE = "Short sleeved blouse with feminine draped sleeve detail.";

    @Execution(ExecutionMode.CONCURRENT)
    @Test
    public void searchForWord() {
        SearchPage blousePage = new WebShopPage(driver).searchForSomething(whatToSearch);
        BlousePopupPage blousePopupPage = blousePage.hoverAndClickQuickView();

        Assertions.assertEquals(STRING_BLOUSE, blousePopupPage.checkDescription(), "The desired message does not appear in the description!");
    }
}
