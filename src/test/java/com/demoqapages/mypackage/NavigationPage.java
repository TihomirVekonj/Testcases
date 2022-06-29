package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.*;


public class NavigationPage extends BasePage {

    private final WebElement interactionsCard = driver.findElement(By.cssSelector("div:nth-of-type(5) .card-up"));
    private final WebElement elementsCard = driver.findElement(By.cssSelector(".category-cards > div:nth-of-type(1) .card-up"));
    private final WebElement widgetsCard = driver.findElement(By.cssSelector("div:nth-of-type(4) .card-up"));


    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    public InteractionsPage clickOnInteractions() {
        interactionsCard.click();
        return new InteractionsPage(driver);
    }

    public ElementsPage clickOnElements() {
        elementsCard.click();
        return new ElementsPage(driver);
    }

    public WidgetPage clickOnWidgets() {
        widgetsCard.click();
        return new WidgetPage(driver);
    }
}
