package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void set_up() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tear_down() {
        if (driver != null) {
            driver.quit();
        }
    }
}
