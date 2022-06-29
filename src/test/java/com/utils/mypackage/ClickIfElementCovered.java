package com.utils.mypackage;

import com.base.mypackage.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickIfElementCovered {

    public void clickElementWait(WebElement element, WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).build().perform();
        actions.click(element).build().perform();

        element.click();
    }
}
