package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.aeonbits.owner.ConfigFactory;
import pages.HomePageObject;
import utility.ConfigEnv;


public class HomePage {

    private HomePageObject homePageObject = new HomePageObject(BaseTest.driver);


    @Given("The user launch the application")
    public void the_user_launch_the_application() {

        ConfigEnv configEnv = ConfigFactory.create(ConfigEnv.class);

        BaseTest.driver.get(configEnv.url());
    }

    @Then("The user search for the item {string}")
    public void the_user_search_for_the_item(String item) {
        homePageObject.search_for_item(item);
    }

}
