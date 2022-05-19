package com.webshoppages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ClickIfElementCovered;
import com.utils.mypackage.ScrollToEndOfPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class WebshopPage extends BasePage {

    public WebshopPage(WebDriver driver) {
        super(driver);
    }

    public void screenShotOrangeDress() throws IOException {
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        WebElement orangeDress = driver.findElement(By.cssSelector("#homefeatured [src='http://automationpractice.com/img/p/8/8-home_default.jpg']"));

        FileUtils.copyFile(orangeDress.getScreenshotAs(OutputType.FILE), new File("target\\screenshots\\screenshot.png"));
    }

    public void searchForBlouse() {
        WebElement searchBar = driver.findElement(By.cssSelector("#search_query_top"));
        searchBar.click();
        searchBar.sendKeys("blouse");
        searchBar.sendKeys(Keys.ENTER);
    }

    public void clickTshirts() {
        WebElement orangeDress = driver.findElement(By.cssSelector(".sf-menu > li > [title='T-shirts']"));
        new ClickIfElementCovered().clickElementWait(orangeDress,driver);
    }
}
