package myprojects.automation.lection3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;
    private By newCategoryButton = By.id("page-header-desc-category-new_category");
    private By successfulCreationAlert = By.className("alert-success");
    private By nameFilterField = By.name("categoryFilter_name");
    private By filterButton = By.id("submitFilterButtoncategory");
    private By tableCellWithCategoryName = By.xpath("//td[contains(text(), SomeCategoryName)]");

    public CategoriesPage(EventFiringWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickNewCategoryLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCategoryButton));
        driver.findElement(newCategoryButton).click();
    }

    public void testSuccessAlertAppearence() {
        if (driver.findElements(successfulCreationAlert).size() > 0) {
            System.out.println("Successful alert is present");
        } else {
            System.out.println("Successful alert is not present");
        }
    }

    public void fillNameFilterField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameFilterField));
        driver.findElement(nameFilterField).sendKeys("SomeCategoryName");
    }

    public void clickFilterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(filterButton));
        driver.findElement(filterButton).click();
    }

    public void waitForCategoryPresence() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tableCellWithCategoryName));
        System.out.println("Created category present");
    }

}
