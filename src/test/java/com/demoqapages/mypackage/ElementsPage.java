package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import com.utils.mypackage.ScrollToEndOfPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementsPage extends BasePage {

    private static final String BUTTON_COLOR = "dc3545";
    private static final String TEXT_TO_CHECK = "C:\\fakepath\\sampleFile.jpeg";
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

        public void clickDynamicProperties() {
        WebElement dynamicProperties = driver.findElement(By.cssSelector(".show li:nth-of-type(9) > .text"));
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".show li:nth-of-type(9) > .text")));
        dynamicProperties.click();
    }

    public void checkButtonsAndText() {
        //web elements
        WebElement randomText = driver.findElement(By.cssSelector("p:first-child"));
        WebElement colorChange = driver.findElement(By.cssSelector("#colorChange"));
        WebElement enableButton = driver.findElement(By.cssSelector("#enableAfter"));
        String text = randomText.getText();

        //wait until visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibleAfter")));
        WebElement invisibleButton = driver.findElement(By.cssSelector("#visibleAfter"));

        String textColor = colorChange.getCssValue("color");

        //assertions
        Assertions.assertEquals("This text has random Id", text, "Error! The desired text is nowhere to be found");
        Assertions.assertTrue(invisibleButton.isDisplayed(), "The desired button is not visible!");
        Assertions.assertEquals(BUTTON_COLOR, Color.fromString(textColor).asHex(), "The button did not change colors!");
        Assertions.assertTrue(enableButton.isEnabled(), "The desired button is not enabled");
    }

    public void clickUploadAndDownload() {
        WebElement uploadAndDownload = driver.findElement(By.cssSelector(".show li:nth-of-type(8)"));
        new ScrollToEndOfPage().scrollUsingPgDown(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".show li:nth-of-type(8)")));
        uploadAndDownload.click();
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        chooseFile.sendKeys("C:\\Users\\Digital Archer\\Work\\Sample pictures\\sampleFile.jpeg");
        WebElement alert = driver.findElement(By.cssSelector("#uploadedFilePath"));

        Assertions.assertEquals(alert.getText(), TEXT_TO_CHECK, "The alert does not display the desired sentence!");
    }
}