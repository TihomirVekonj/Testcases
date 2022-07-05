package com.factory.mypackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BaseFactory {

    public WebDriver maximize(WebDriver driver) {
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1920,1080));
        return driver;
    }
}
