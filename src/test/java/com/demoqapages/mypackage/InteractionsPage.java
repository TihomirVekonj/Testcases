package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InteractionsPage extends BasePage {


    public InteractionsPage(WebDriver driver) {
        super(driver);
    }

    public DroppablePage clickDroppable() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        final WebElement droppable = driver.findElement(By.cssSelector(".show li:nth-of-type(4) > .text"));
        new ClickIfElementCovered().clickElementWait(droppable, driver);

        return new DroppablePage(driver);
    }
}
