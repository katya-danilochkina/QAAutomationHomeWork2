package myprojects.automation.lection3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {
    private EventFiringWebDriver driver;
    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By loginButton = By.name("submitLogin");
    private String pageAddress = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea";
    private String adminEmail = "webinar.test@gmail.com";
    private String adminPassword = "Xcg7299bnSmMuRLp9ITw";

    public LoginPage(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void open() { driver.get(pageAddress); }

    public void fillEmailInput() { driver.findElement(emailInput).sendKeys(adminEmail); }

    public void fillPasswordInput() { driver.findElement(passwordInput).sendKeys(adminPassword); }

    public void clickSubmitButton() { driver.findElement(loginButton).click(); }
}
