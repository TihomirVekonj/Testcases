package com.demoqapages.mypackage;

import com.base.mypackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage extends BasePage {


    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public String uploadFile() {
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        chooseFile.sendKeys("C:\\Users\\Digital Archer\\Work\\Sample pictures\\sampleFile.jpeg");
        WebElement alert = driver.findElement(By.cssSelector("#uploadedFilePath"));

        return alert.getText();
    }
}
