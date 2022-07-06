package com.utils.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToFrame {

    public void switchToFrame(WebDriver driver) {
        driver.switchTo().defaultContent();
        WebElement newFrame = driver.findElement(By.cssSelector(".fancybox-iframe"));
        driver.switchTo().frame(newFrame);
    }
}
