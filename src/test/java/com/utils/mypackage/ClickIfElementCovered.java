package com.utils.mypackage;

import com.base.mypackage.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickIfElementCovered extends TestBase {

    Actions actions = new Actions(getDriver());

    public void clickElementWait(WebElement element) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.moveToElement(element).build().perform();
        actions.pause(Duration.ofSeconds(2));
        actions.click(element).build().perform();
//        element.click();
    }
}
