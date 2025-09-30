package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import page.LoginPage;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\Archivos de uso Profesional\\Curso\\PracticeAutomation26\\src\\test\\resources\\chromedriver\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.chrome.driver", "");
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Navegador no soportado.");
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
        public static void implicitWait(String[] args){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.quit();
        }
    }

