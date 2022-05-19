package com.demoqatest.mypackage;

import com.demoqapages.mypackage.ElementsPage;
import com.demoqapages.mypackage.NavigationPage;
import org.junit.jupiter.api.Test;

public class UploadTest extends DemoQaTestBase {

    @Test
    public void uploadTest() {
        new NavigationPage(driver).clickOnElements();
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickUploadAndDownload();
        elementsPage.uploadFile();
    }
}
