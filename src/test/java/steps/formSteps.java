package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.FormPage;

public class formSteps {
    WebDriver driver;
    FormPage formPage;

    public formSteps() {
        this.driver = webStepsLogin.getDriver();
        this.formPage = webStepsLogin.getformPage();
    }

    @When("the user enters name {string} on practice form demoqa page")
    public void the_user_enters_name_on_practice_form_demoqa_page(String Name) {
        formPage.enterName(Name);
    }

    @When("the user enters lastname {string} on practice form demoqa page")
    public void the_user_enters_lastname_on_practice_form_demoqa_page(String Lastname) {
        formPage.enterlastName(Lastname);
    }

    @When("the user enters email {string} on practice form demoqa page")
    public void the_user_enters_email_on_practice_form_demoqa_page(String Email) {
        formPage.enterEmail(Email);
    }

    @When("the user clicks male option gender")
    public void the_user_clicks_male_option_gender() {
        formPage.clickGender();

    }

    @When("the user enters number {string} on practice form demoqa page")
    public void theUserEntersNumberOnPracticeFormDemoqaPage(String Num) {
        formPage.enterNumber(Num);
    }

    @When("the user enters the date of birth {string} {string} {string} on date of birth practice form demoqa page")
    public void the_user_enters_the_date_of_birth_on_date_of_birth_practice_form_demoqa_page(String dateDay, String dateMonth, String dateYear) {
        formPage.enterBirth(dateDay, dateMonth, dateYear);

    }

    @When("the user enters subject {string} on practice form demoqa page")
    public void the_user_enters_subject_on_practice_form_demoqa_page(String Math) {
        formPage.subContainer(Math);

    }

    @When("the user clicks {string} on practice form demoqa page")
    public void the_user_clicks_on_practice_form_demoqa_page(String OptionSelect) {
        formPage.clickoptions(OptionSelect);
    }

    @When("the user upload file picture on path {string}")
    public void the_user_upload_file_picture_on_path(String Path) {
        formPage.UploadImage(Path);
    }

    @When("the user enters address {string} on practice form demoqa page")
    public void the_user_enters_address_on_practice_form_demoqa_page(String address) {
        formPage.enterAdress(address);

    }

    @When("the user selects {string} state option on practice form demoqa page")
    public void the_user_selects_state_option_on_practice_form_demoqa_page(String optionState) {
        formPage.stateSelector(optionState);

    }

    @When("the user selects {string} city option on practice form demoqa page")
    public void the_user_selects_city_option_on_practice_form_demoqa_page(String optionCity) {
        formPage.citySelector(optionCity);

    }

    @Then("the user clicks submit button on practice form demoqa page")
    public void theUserClicksSubmitButtonOnPracticeFormDemoqaPage() {
        formPage.clickSubmit();
    }
}
