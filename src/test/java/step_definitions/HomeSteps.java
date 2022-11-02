package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
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

    @And("Navigate to {string} dashboard")
    public void navigateToDashboard(String text) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, text))));
    }

    @And("Click a button {string}")
    public void clickAButton(String btn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_BUTTON, btn))));
    }

    @And("Add question {string}")
    public void addQuestion(String message) {
        BrowserUtils.sendKeys(page.addQuestionBtn, message);
    }

    @Then("Verify text {string} is displayed")
    public void verifyTextIsDisplayed(String text) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_TEXT, text + "   "))));
    }
    @Then("Verify header text is {string}")
    public void verifyHeaderTextIs(String headerText) {
        WebElement element = BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, headerText)));
        BrowserUtils.assertEquals(element.getText(), headerText);
    }
    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().
                findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, button))));
    }

    @Then("Verify button {string} is not displayed")
    public void verifyButtonIsNotDisplayed(String button2) {
        BrowserUtils.assertFalse(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, button2))).isDisplayed());
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String dashboard) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, dashboard))));
    }

        }




