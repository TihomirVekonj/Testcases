package com.webshoppages.mypackage;

import com.utils.mypackage.ScrollToEndOfPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class WebShopPage extends WebShopBasePage {

    public WebShopPage(WebDriver driver) {
        super(driver);
    }

    public void screenShotOrangeDress() throws IOException {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement orangeDress = driver.findElement(By.cssSelector("[title=\"Printed Dress\"]"));
        FileUtils.copyFile(orangeDress.getScreenshotAs(OutputType.FILE), new File("target\\screenshots\\screenshot.png"));
    }

    public SearchPage searchForSomething(String search) {
        WebElement searchBar = driver.findElement(By.cssSelector("#search_query_top"));
        searchBar.click();
        searchBar.sendKeys(Objects.requireNonNullElse(search, "blouse"));
        searchBar.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }

    public TshirtPage clickTShirt() {
        driver.findElement(By.cssSelector(".sf-menu > li > [title='T-shirts']")).click();
        return new TshirtPage(driver);
    }
}
