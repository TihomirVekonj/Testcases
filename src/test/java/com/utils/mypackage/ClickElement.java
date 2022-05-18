package com.utils.mypackage;

import com.base.mypackage.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

    public void clickElement(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        actions.click(element).build().perform();
    }
}
