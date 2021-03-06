package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import java.time.Duration;

public class DroppablePage extends BasePage {

    protected Actions actions = new Actions(driver);

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public String dragAndDropCheck() {
        WebElement from = driver.findElement(By.cssSelector("#draggable"));
        WebElement to = driver.findElement(By.cssSelector("#simpleDropContainer > #droppable"));

        actions.moveToElement(from).pause(Duration.ofSeconds(1)).clickAndHold(from).pause(Duration.ofSeconds(1)).moveToElement(to).release().perform();

        final String colorAsRGB = to.getCssValue("background-color");
        return Color.fromString(colorAsRGB).asHex();
    }
}
