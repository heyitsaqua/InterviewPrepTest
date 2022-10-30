package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @And("Add a do statement {string}")
    public void addADoStatement(String message) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Add do "))));

        BrowserUtils.sendKeys(page.doInput, message);

        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Enter"))));
    }

    @Then("Verify {string} statement is displayed")
    public void verifyStatementIsDisplayed(String message) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_TEXT, message)
        )));
    }

    @And("Add a dont statement {string}")
    public void addADontStatement(String message) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Add don't "))));

        BrowserUtils.sendKeys(page.dontInput, message);

        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, "Enter"))));
    }

    @Then("Verify {string} statement is not displayed")
    public void verifyStatementIsNotDisplayed(String message) {
        BrowserUtils.assertFalse(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_TEXT, message))).isDisplayed());
    }
}
