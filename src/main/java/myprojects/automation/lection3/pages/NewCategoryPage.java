package myprojects.automation.lection3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCategoryPage {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;

    private By nameField = By.id("name_1");
    private By submitCategoryButton = By.id("category_form_submit_btn");

    public NewCategoryPage(EventFiringWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void fillNameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys("SomeCategoryName");
    }

    public void submitCategoryForm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitCategoryButton));
        driver.findElement(submitCategoryButton).click();
    }


}
