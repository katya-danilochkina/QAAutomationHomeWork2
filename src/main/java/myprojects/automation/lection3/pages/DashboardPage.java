package myprojects.automation.lection3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;
    private By catalog = By.id("subtab-AdminCatalog");
    private By category = By.id("subtab-AdminCategories");

    public DashboardPage (EventFiringWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void hoverCatalog() {
        Actions action = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalog));
        action.moveToElement(driver.findElement(catalog)).build().perform();
    }

    public void clickCategory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(category));
        driver.findElement(category).click();
    }

}
