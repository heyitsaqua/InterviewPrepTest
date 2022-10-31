package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddNewUserPage;
import pages.CommonPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class AddNewUserSteps implements CommonPage {

    AddNewUserPage page;

    public AddNewUserSteps() {
        page = new AddNewUserPage();
    }

    @Then("I click the button Manage Access")
    public void iClickTheButtonManageAccess() {
        BrowserUtils.click(page.manageAccesBtn);
    }

    @Then("Verify following inputs fields are Displayed")
    public void verifyFollowingInputsFieldsAreDisplayed(List<String> dataTable) {
        for (String each : dataTable) {
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, each))
                    )
            );
        }
    }


    @Then("Verify is {string} is displayed")
    public void verifyIsIsDisplayed(String select) {
        BrowserUtils.isDisplayed(page.selectRole);

    }

    @Then("Verify is {string} is displayed2")
    public void verifyIsIsDisplayed2(String select2) {
        BrowserUtils.isDisplayed(page.selectBatch);

    }

    @Then("I fill out user registration form:")
    public void iFillOutUserRegistrationForm(Map<String, String> map) {
        for (String key : map.keySet()) {
            BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                    String.format(XPATH_TEMPLATE_INPUT_FIELD, key)
            )), map.get(key));
        }

    }


    @Then("select role and bacth")
    public void selectRoleAndBacth(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase("role")) {
                BrowserUtils.selectByVisibleText(page.selectRole, map.get(key));
            } else {
                BrowserUtils.selectByVisibleText(page.selectBatch, map.get(key));
            }
        }
    }

    @Then("Verify the new user is display on the table")
    public void verifyTheNewUserIsDisplayOnTheTable() {
       List<WebElement> each = BrowserUtils.getDriver().findElements(By.xpath("//td[text()='j.wick@contractor.gov']"));
       for(WebElement list: each){
           BrowserUtils.assertEquals(list.getText(), "j.wick@contractor.gov");
       }

    }
}
