package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("username");
    By password = By.xpath("/html/body/div/div/section/section/div[1]/div[2]/input");
    By button_Password = By.cssSelector("#submit");

    public void enterUsername(String user){
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String passcode){
        driver.findElement(password).sendKeys(passcode);
    }

    public void clickContinueElement() {
        driver.findElement(button_Password).click();
        }
    }


