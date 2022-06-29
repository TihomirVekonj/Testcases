package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPropertyPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public DynamicPropertyPage(WebDriver driver) {
        super(driver);
    }


    public String checkText() {
        WebElement randomText = driver.findElement(By.cssSelector("p:first-child"));
        return randomText.getText();
    }

    public Boolean checkVisibilityOfButton() {
        WebElement invisibleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibleAfter")));
        return invisibleButton.isDisplayed();
    }

    public Boolean checkColorChangeButton() {
        WebElement colorChangeButton = driver.findElement(By.cssSelector("#colorChange"));
        return wait.until(ExpectedConditions.attributeToBe(colorChangeButton, "color", "rgba(220, 53, 69, 1)"));
    }

    public Boolean checkEnableButton() {
        WebElement enableButton = driver.findElement(By.cssSelector("#enableAfter"));
        return enableButton.isEnabled();
    }
}