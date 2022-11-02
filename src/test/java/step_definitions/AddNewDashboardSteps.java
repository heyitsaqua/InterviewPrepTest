package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AddNewDashboardPage;
import pages.CommonPage;
import utils.BrowserUtils;

public class AddNewDashboardSteps implements CommonPage {
    AddNewDashboardPage page;
    public AddNewDashboardSteps(){
        page = new AddNewDashboardPage();
    }
    @Then("Create a New dashboard")
    public void createANewDashboard() {
        BrowserUtils.sendKeys(page.inputName, "New board");
    }

    @And("I click the button {string}")
    public void iClickTheButton(String addBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, addBtn))
        ));
    }

    @Then("Verify is the new dashboard is created")
    public void verifyIsTheNewDashboardIsCreated() {
        BrowserUtils.isDisplayed(page.newdashboard);

    }
}
