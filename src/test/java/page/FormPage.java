package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    By name = By.id("firstName");
    By lastname = By.id("lastName");
    By email = By.xpath("//input[@id='userEmail']");
    By maleGender = By.cssSelector("label[for='gender-radio-1']");
    By userNumber = By.id("userNumber");
    By dateofBirth = By.id("dateOfBirthInput");
    By yearBirth = By.className("react-datepicker__year-select");
    By monthBirth = By.className("react-datepicker__month-select");
    By subjectsContainer = By.id("subjectsInput");
    By elementMaths = By.xpath("//div[contains(@id,'react-select') and text()='Maths']");
    By optionSports = By.cssSelector("label[for='hobbies-checkbox-1']");
    By optionMusic = By.cssSelector("label[for='hobbies-checkbox-3']");
    By uploadImage = By.id("uploadPicture");
    By enterAddress = By.cssSelector("#currentAddress-wrapper textarea");
    By selectState = By.id("stateCity-wrapper");
    By subjectStateNCR = By.xpath("//div[text()='NCR']");
    By selectCity = By.id("city");
    By subjectCityDelhi = By.xpath("//div[text()='Delhi']");
    By submitButton = By.id("submit");



    public void enterName(String user){
        driver.findElement(name).sendKeys(user);
    }

    public void enterlastName(String Lname){
        driver.findElement(lastname).sendKeys(Lname);
    }

    public void enterEmail(String mail){
        driver.findElement(email).sendKeys(mail);
    }

    public void clickGender(){
        driver.findElement(maleGender).click();
    }

    public void enterNumber(String enterNum){
        driver.findElement(userNumber).sendKeys(enterNum);
    }

    public void enterBirth (String dateDay, String dateMonth, String dateYear){
        driver.findElement(dateofBirth).click();
        //Selecciona el Year
        WebElement dayDropdown = driver.findElement(yearBirth);
        Select selectYear = new Select(dayDropdown);
        selectYear.selectByVisibleText(String.valueOf(dateYear));

        // Selecciona el mes
        WebElement monthDropdown = driver.findElement(monthBirth);
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText(String.valueOf(dateMonth));

        // Selecciona el dia
        int dayInt = Integer.parseInt(dateDay);
        String formattedDay = String.format("%03d", dayInt);
        WebElement dayElement = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--" + formattedDay + "') and not(contains(@class,'outside-month'))]"));
        dayElement.click();

    }

    public void subContainer (String option){
        driver.findElement(subjectsContainer).sendKeys(option);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement mathOption = wait.until(ExpectedConditions.visibilityOfElementLocated(elementMaths));
        mathOption.click();
    }

    public void clickoptions(String Optionselect){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        switch (Optionselect.trim().toLowerCase()){
            case "sports":
                wait.until(ExpectedConditions.elementToBeClickable(optionSports)).click();
                break;
            case "music":
                wait.until(ExpectedConditions.elementToBeClickable(optionMusic)).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid hobby: " + Optionselect);
        }
    }

    public void UploadImage(String pathFile){
        driver.findElement(uploadImage).sendKeys(pathFile);
    }

    public void enterAdress (String Address){
        driver.findElement(enterAddress).sendKeys(Address);
    }


    public void stateSelector(String optionState) {
        driver.findElement(selectState).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        switch (optionState.trim().toLowerCase()){
            case "ncr":
                wait.until(ExpectedConditions.elementToBeClickable(subjectStateNCR)).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid state: " + optionState);
        }

    }

    public void citySelector(String optionCity) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(selectCity)).click();
        switch (optionCity.trim().toLowerCase()){
            case "delhi":
                wait.until(ExpectedConditions.elementToBeClickable(subjectCityDelhi)).click();
                break;
            default:
                throw new IllegalArgumentException("Invalid state: " + optionCity);
        }
    }
    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
}
