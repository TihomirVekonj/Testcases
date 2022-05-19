package com.webshoppages.mypackage;

import com.base.mypackage.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BlousePage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    String stringToCompare = "Short sleeved blouse with feminine draped sleeve detail.";

    public BlousePage(WebDriver driver) {
        super(driver);
    }

    public void hoverAndClickQuickView() {
        Actions actions = new Actions(driver);
        WebElement blouseFirstResult = driver.findElement(By.cssSelector("[alt='Blouse']"));
        actions.moveToElement(blouseFirstResult).build().perform();
        WebElement quickView = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".quick-view")));
        quickView.click();
    }

    public void checkDescription() {
        String stringFromDescription  = driver.findElement(By.xpath("//p[.='Short sleeved blouse with feminine draped sleeve detail.']")).getAttribute("innerHTML");
        Assertions.assertEquals(stringToCompare, stringFromDescription, "The desired message does not appear in the description!");
    }
}

