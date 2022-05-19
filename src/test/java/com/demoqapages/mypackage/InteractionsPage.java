package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.time.Duration;


public class InteractionsPage extends BasePage {


    private static final String DAND_BG_COLOR = "#4682b4";
    public Actions actions = new Actions(driver);


    public InteractionsPage(WebDriver driver) {
        super(driver);
    }

    public void clickDroppable() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement droppable = driver.findElement(By.cssSelector(".show li:nth-of-type(4) > .text"));
        new ClickIfElementCovered().clickElementWait(droppable, driver);
    }

    public void dragAndDropCheck() {
        WebElement from = driver.findElement(By.cssSelector("#draggable"));
        WebElement to = driver.findElement(By.cssSelector("#simpleDropContainer > #droppable"));

        actions.moveToElement(from)
                .moveByOffset(20, -20)
                .pause(Duration.ofSeconds(1))
                .clickAndHold(from)
                .pause(Duration.ofSeconds(1))
                .moveToElement(to)
                .pause(Duration.ofSeconds(1))
                .release().build().perform();

        String colorAsRGB = to.getCssValue("background-color");
        Assertions.assertEquals(DAND_BG_COLOR, Color.fromString(colorAsRGB).asHex(), "Error! The droppable window is not steel-blue!");
    }
}
