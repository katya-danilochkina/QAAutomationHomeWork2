package myprojects.automation.lection3.tests;

import myprojects.automation.lection3.BaseTest;
import myprojects.automation.lection3.pages.CategoriesPage;
import myprojects.automation.lection3.pages.DashboardPage;
import myprojects.automation.lection3.pages.LoginPage;
import myprojects.automation.lection3.pages.NewCategoryPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MyTest extends BaseTest {
    public static void main(String[] args) {
//        1. Войти в Админ Панель
//        2. Выбрать пункт меню Каталог -> категории и дождаться загрузки страницы управления
//        категориями.
//        3. Нажать «Добавить категорию» для перехода к созданию новой категории.
//        4. После загрузки страницы ввести название новой категории и сохранить изменения. На
//        странице управления категориями должно появиться сообщение об успешном
//        создании категории.
//        5. Отфильтровать таблицу категорий по имени и дождаться там появления записи
//        созданной категории.

        EventFiringWebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickSubmitButton();


        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.hoverCatalog();
        dashboardPage.clickCategory();

        CategoriesPage categoriesPage = new CategoriesPage(driver);
        categoriesPage.clickNewCategoryLink();

        NewCategoryPage newCategoryPage = new NewCategoryPage(driver);
        newCategoryPage.fillNameField();
        newCategoryPage.submitCategoryForm();

        categoriesPage.testSuccessAlertAppearence();
        categoriesPage.fillNameFilterField();
        categoriesPage.clickFilterButton();
        categoriesPage.waitForCategoryPresence();

        quitDriver(driver);
    }

}
