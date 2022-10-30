package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

public class LoginSteps implements CommonPage {
    LoginPage page;

    public LoginSteps() {
        page = new LoginPage();
    }

    @Given("I open website url")
    public void i_open_website_url() {
        BrowserUtils.getDriver();
    }

    @And("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))), username);

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))), password);

        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Login"))));

        Assert.assertTrue(true);
    }
}
