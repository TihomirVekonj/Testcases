package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetPage extends BasePage {


    public WidgetPage(WebDriver driver) {
        super(driver);
    }

    public ToolTipsPage clickToolTip() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement toolTipList = driver.findElement(By.cssSelector(".show li:nth-of-type(7)"));
        new ClickIfElementCovered().clickElementWait(toolTipList, driver);

        return new ToolTipsPage(driver);
    }
}
