package com.utils.mypackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToEndOfPage {

    public void scrollUsingPgDown(WebDriver driver) {
        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
