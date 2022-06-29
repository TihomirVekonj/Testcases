package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ToolTipsPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    Actions actions = new Actions(driver);

    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }

    public String checkToolTip() {
        WebElement toolTipButton = driver.findElement(By.cssSelector("#toolTipButton"));
        actions.moveToElement(toolTipButton).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tooltip-inner")));
        WebElement toolTip = driver.findElement(By.cssSelector(".tooltip-inner"));

       return toolTip.getText();
    }
}
