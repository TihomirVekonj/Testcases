package com.webshoptests.mypackage;

import com.webshoppages.mypackage.WebShopPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.IOException;

public class ScreenshotTest extends WebShopTestBase {

    @Execution(ExecutionMode.CONCURRENT)
    @Test
    public void orangeDressScreenShotTest() throws IOException {
        new WebShopPage(driver).screenShotOrangeDress();
    }
}
