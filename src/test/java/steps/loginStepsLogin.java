package steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class loginStepsLogin {

    WebDriver driver;
    LoginPage loginPage;

    public loginStepsLogin() {
        this.driver = webStepsLogin.getDriver();
        this.loginPage = webStepsLogin.getLoginPage();
    }

    @When("the user enters username {string} on login page")
    public void the_user_enters_usernamelgn(String username) {
        loginPage.enterUsername(username);
    }

    @When("the user enters password {string} on login page")
    public void the_user_enters_passwordlgn(String passcode) {
        loginPage.enterPassword(passcode);
    }

    @Then("the user clicks login continue button on practiceautomation page")
    public void the_user_clicks_button_on_practiceautomation_page() {
        loginPage.clickContinueElement();
    }
}

