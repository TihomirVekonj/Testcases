package com.webshoppages.mypackage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage extends WebShopBasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public BlousePopupPage hoverAndClickQuickView() {
        WebElement blouseFirstResult = driver.findElement(By.cssSelector("[alt='Blouse']"));
        actions.moveToElement(blouseFirstResult).build().perform();
        WebElement quickView = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".quick-view")));
        quickView.click();
        return new BlousePopupPage(driver);
    }
}

