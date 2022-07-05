package com.webshoppages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class WebShopBasePage extends BasePage {

    public WebShopBasePage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);
}
