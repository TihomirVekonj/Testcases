package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InteractionsPage extends BasePage {


    private static final String DAND_BG_COLOR = "#4682b4";


    public InteractionsPage(WebDriver driver) {
        super(driver);
    }

    public void clickDroppable() {
//        driver.manage().window().maximize();
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-of-type(6) .header-text")));
        WebElement droppable = driver.findElement(By.cssSelector(".show.element-list li:nth-of-type(4)"));
        droppable.click();
    }

    public void dragAndDropCheck() {
        WebElement from = driver.findElement(By.cssSelector("#draggable"));
        WebElement to = driver.findElement(By.cssSelector("#simpleDropContainer > #droppable"));
        Actions actions = new Actions(driver);

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
