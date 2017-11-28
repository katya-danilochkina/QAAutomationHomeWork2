package myprojects.automation.lection3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") + "/drivers/chromedriver");
        return new ChromeDriver();
    }

    protected static EventFiringWebDriver getConfiguredDriver() {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        eventDriver.register(new EventHandler());
        return eventDriver;
    }

    protected static void quitDriver(EventFiringWebDriver driver) { driver.quit(); }
}
