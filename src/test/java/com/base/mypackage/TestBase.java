package com.base.mypackage;

import com.enums.mypackage.BrowserEnums;
import com.extensions.mypackage.ScreenshotExtension;
import com.utils.mypackage.ChooseBrowser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.Objects;

@ExtendWith(ScreenshotExtension.class)
public abstract class TestBase {

    public static String browser = System.getProperty("browser");
    public static String driverType = System.getProperty("remote");
    public static String ipAddress = System.getProperty("ip");
    private static final BrowserEnums DEFAULT_BROWSER = BrowserEnums.EDGE_HEADLESS;
    private static final String DEFAULT_IP_ADDRESS = "192.168.0.132:4444";
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    @BeforeEach
    public void setUp() {
        webDriver.set(getDriverType(driverType));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebDriver getDriver() {
        return webDriver.get();
    }

    public void removeDriver() {
        webDriver.remove();
    }

    private static BrowserEnums getBrowserEnum(String browser) {
        for(BrowserEnums enumValues : BrowserEnums.values()) {
            if(enumValues.stringBrowser.equalsIgnoreCase(browser)) {
                return enumValues;
            }
        }
        return DEFAULT_BROWSER;
    }

    private static WebDriver getDriverType(String driverString) {
        if(Objects.equals(driverString, "true")) {
            if(ipAddress==null) {
                ipAddress = DEFAULT_IP_ADDRESS;
            }
            return ChooseBrowser.switchBrowserRemote(getBrowserEnum(browser),ipAddress);
        } else{
            return ChooseBrowser.switchBrowser(getBrowserEnum(browser));
        }
    }
}
