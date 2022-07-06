package com.demoqatest.mypackage;

import com.demoqapages.mypackage.ElementsPage;
import com.demoqapages.mypackage.NavigationPage;
import com.demoqapages.mypackage.UploadPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class UploadTest extends DemoQaTestBase {

    private static final String TEXT_TO_CHECK = "C:\\fakepath\\sampleFile.jpeg";

    @Test
    public void uploadTest() {

        final ElementsPage elementsPage = new NavigationPage(getDriver()).clickOnElements();
        final UploadPage uploadPage = elementsPage.clickUploadAndDownload();

        Assertions.assertEquals(uploadPage.uploadFile(), TEXT_TO_CHECK, "The alert does not display the desired sentence!");
    }
}
