package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ToolTipsPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions actions = new Actions(driver);

    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    public String checkToolTip() {
        actions.pause(Duration.ofSeconds(2));
        actions.moveToElement(driver.findElement(By.cssSelector("#toolTipButton"))).build().perform();
        actions.pause(Duration.ofSeconds(2));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.tooltip-inner"))).getText();
    }
}
