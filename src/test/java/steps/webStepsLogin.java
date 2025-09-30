package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page.FormPage;
import page.LoginPage;
import page.SwagLabsPage;
import utils.DriverManager;

public class webStepsLogin {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static FormPage formPage;
    public static SwagLabsPage swagLabsPage;

    @Given("the user open {string} with {string} url page")
    public void the_user_open_with_url_page(String browser, String URL) {
        driver = DriverManager.getDriver(browser);
        driver.get(URL);
        loginPage = new LoginPage(driver);
        formPage = new FormPage(driver);
        swagLabsPage = new SwagLabsPage(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static LoginPage getLoginPage() {
        return loginPage;
    }

    public static FormPage getformPage() {
        return formPage;
    }

    public static SwagLabsPage getSwaglabsPage() {
        return swagLabsPage;
    }



}
