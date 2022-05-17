package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WidgetPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public WidgetPage(WebDriver driver) {
        super(driver);
    }

    public void clickToolTip() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
//        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".show li:nth-of-type(7)")));
        WebElement toolTipList = driver.findElement(By.cssSelector(".show li:nth-of-type(7)"));
        toolTipList.click();
    }

    public void checkToolTip() {
        WebElement toolTipButton = driver.findElement(By.cssSelector("#toolTipButton"));
        Actions a = new Actions(driver);
        a.moveToElement(toolTipButton).build().perform();
        WebElement toolTip = driver.findElement(By.cssSelector(".tooltip-inner"));
        String tt = toolTip.getText();

        Assertions.assertEquals("You hovered over the Button", tt);
    }


}
