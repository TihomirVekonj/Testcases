package com.webshoppages.mypackage;

import com.utils.mypackage.SwitchToFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TShirtPopupPage extends WebShopBasePage {

    public TShirtPopupPage(WebDriver driver) {
        super(driver);
    }

    public OrderDataVerificationPopupPage setOrderParameters(String color) {
        new SwitchToFrame().switchToFrame(driver);
        switch (color) {
            case "Orange": driver.findElement(By.cssSelector("#color_13")).click();
            break;
            case "Blue": driver.findElement(By.cssSelector("#color_14")).click();
            break;
        }

        WebElement selectElement = driver.findElement(By.id("group_1"));
        Select select = new Select(selectElement);

        select.selectByIndex(1);

        driver.findElement(By.cssSelector(".exclusive:first-child")).click();
        return new OrderDataVerificationPopupPage(driver);
    }
}
