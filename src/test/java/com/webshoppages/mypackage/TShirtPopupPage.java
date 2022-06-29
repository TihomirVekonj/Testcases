package com.webshoppages.mypackage;

import com.utils.mypackage.SwitchToFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtPopupPage extends WebShopBasePage {

    public TShirtPopupPage(WebDriver driver) {
        super(driver);
    }

    public OrderDataVerificationPopupPage setOrderParameters() {
        new SwitchToFrame().switchToFrame(driver);
        driver.findElement(By.cssSelector("#group_1")).click();
        driver.findElement(By.cssSelector("[value='2']")).click();
        driver.findElement(By.cssSelector("#color_13")).click();
        driver.findElement(By.cssSelector(".exclusive:first-child")).click();
        return new OrderDataVerificationPopupPage(driver);
    }
}
