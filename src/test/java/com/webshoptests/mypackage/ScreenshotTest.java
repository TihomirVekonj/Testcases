package com.webshoptests.mypackage;

import com.webshoppages.mypackage.WebShopPage;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class ScreenshotTest extends WebShopTestBase {

    @Test
    public void orangeDressScreenShotTest() throws IOException {
        new WebShopPage(getDriver()).screenShotOrangeDress();
    }
}
