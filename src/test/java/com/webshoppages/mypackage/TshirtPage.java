package com.webshoppages.mypackage;

import com.utils.mypackage.ScrollToEndOfPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TshirtPage extends WebShopBasePage {

    public TshirtPage(WebDriver driver) {
        super(driver);
    }

    public TShirtPopupPage SelectTShirt() {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement quickView = driver.findElement(By.cssSelector(".quick-view"));
        WebElement product = driver.findElement(By.cssSelector(".product-image-container:nth-child(1)"));
        actions.moveToElement(product).build().perform();
        quickView.click();
        return new TShirtPopupPage(driver);
    }
}
