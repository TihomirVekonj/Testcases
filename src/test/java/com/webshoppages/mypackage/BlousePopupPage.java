package com.webshoppages.mypackage;

import com.utils.mypackage.SwitchToFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlousePopupPage extends WebShopBasePage{

    public BlousePopupPage(WebDriver driver) {
        super(driver);
    }

    public String checkDescription() {
        new SwitchToFrame().switchToFrame(driver);
        return driver.findElement(By.cssSelector("#short_description_content")).getText();
    }
}
