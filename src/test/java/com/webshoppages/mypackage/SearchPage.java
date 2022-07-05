package com.webshoppages.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchPage extends WebShopBasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public BlousePopupPage hoverAndClickQuickView() {
        actions.pause(Duration.ofSeconds(2));
        actions.moveToElement(driver.findElement(By.cssSelector("li.ajax_block_product"))).perform();
        actions.pause(Duration.ofSeconds(2));
//        actions.moveToElement(driver.findElement(By.xpath("//span[.='Quick view']")));
//        actions.click();
        WebElement quickView = driver.findElement(By.xpath("//span[.='Quick view']"));
        wait.until(ExpectedConditions.visibilityOf(quickView)).click();
        return new BlousePopupPage(driver);
    }
}

