package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    //By locators
    private By search_item = By.id("twotabsearchtextbox");

    //Functions
    public void search_for_item(String item) {
        WebElement search_input = driver.findElement(search_item);
        search_input.sendKeys(item);
    }
}
