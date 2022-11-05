package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddNewUserPage;
import pages.CommonPage;
import pages.UpdateUserPage;
import utils.BrowserUtils;

import java.util.List;

public class UpdateInfoSteps implements CommonPage {
    UpdateUserPage page;

    public UpdateInfoSteps() {
        page = new UpdateUserPage();
    }

    @Then("I edit {string}")
    public void iEdit(String firstName) {
        BrowserUtils.sendKeys(page.firstName, "sara");
    }

    @Then("I Verify if the First Name is update")
    public void iVerifyIfTheFirstNameIsUpdate() {
        List<WebElement> each = BrowserUtils.getDriver().findElements(By.xpath("//td[text()='sara']"));
        for(WebElement list: each){
            BrowserUtils.assertEquals(list.getText(), "sara");
        }

    }

    @Then("I clear {string}")
    public void iClear(String clear) {
        BrowserUtils.getDriver().findElement(By.xpath("//div[@class='modal-content']//div//input[@id='Firstname']")).clear();
    }

    @Then("I click the button Delete popWindow")
    public void iClickTheButtonDeletePopWindow() {
        BrowserUtils.click(page.deleteBTn);
    }

    @Then("I verify the button is displayed {string}")
    public void iVerifyTheButtonIsDisplayed(String resetPassword) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON,resetPassword))));
    }
}
