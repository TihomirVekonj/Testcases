package com.webshoptests.mypackage;


import com.webshoppages.mypackage.WebshopPage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ScreenshotTest extends WebshopTestBase {

    @Test
    public void OrangeDressScreenshotTest() throws IOException {
        new WebshopPage(driver).screenShotOrangeDress();
    }
}
