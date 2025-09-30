package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp(){

    }
    @After
    public void tearDown() throws InterruptedException {
        System.out.println("The test is going to close!...");
        Thread.sleep(5000);
        System.out.println("Test ended, the browser is shutting down... ");
        DriverManager.quitDriver();
    }
}
