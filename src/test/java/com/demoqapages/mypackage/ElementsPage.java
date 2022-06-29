package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {


    public ElementsPage(WebDriver driver) {
        super(driver);
    }

        public DynamicPropertyPage clickDynamicProperties() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement dynamicProperties = driver.findElement(By.cssSelector(".show li:nth-of-type(9) > .text"));
        new ClickIfElementCovered().clickElementWait(dynamicProperties, driver);

        return new DynamicPropertyPage(driver);
    }

    public UploadPage clickUploadAndDownload() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement uploadAndDownload = driver.findElement(By.cssSelector(".show li:nth-of-type(8)"));
        new ClickIfElementCovered().clickElementWait(uploadAndDownload, driver);

        return new UploadPage(driver);
    }
}