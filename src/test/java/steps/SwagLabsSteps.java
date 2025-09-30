package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.SwagLabsPage;

public class SwagLabsSteps {
    WebDriver driver;
    SwagLabsPage swagLabsPage;

    public SwagLabsSteps() {
        this.driver = webStepsLogin.getDriver();
        this.swagLabsPage = webStepsLogin.getSwaglabsPage();
    }

    @When("the user validates the presence of title page on SwagLabs page")
    public void theUserValidatesThePresenceOfTitlePageOnSwagLabsPage() {
        swagLabsPage.getTitlePage();
    }
}
