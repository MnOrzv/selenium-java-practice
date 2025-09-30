package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabsPage {
    WebDriver driver;

    public SwagLabsPage(WebDriver driver) {
        this.driver = driver;
    }

    By titlePage = By.className("login_logo");

    public void getTitlePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(titlePage));
        String titlepage = driver.findElement(titlePage).getText();
        System.out.println("The title of the page is: " + titlepage);
    }
}
