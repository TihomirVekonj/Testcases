package com.utils.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickElement {

    public void clickElement(String elementStr, WebDriver driver) {
        driver.findElement(By.cssSelector(elementStr)).click();
    }
}
