package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.FilterUserPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class FilterUserSteps implements CommonPage {
    FilterUserPage page;

    public FilterUserSteps() {
        page = new FilterUserPage();
    }

    @Then("I select the Filter All is displayed")
    public void iSelectTheFilterAllIsDisplayed(List<String> data) {
        for (String each : data) {
                BrowserUtils.selectByVisibleText(page.filterBtn, each);
        }
    }

    @Then("I Verify if the search can type")
    public void iVerifyIfTheSearchCanType() {
        BrowserUtils.sendKeys(page.searchBtn, "jhon");

    }


    @Then("I click the button sumit")
    public void iClickTheButtonSumit() {
        BrowserUtils.click(page.searchBTn2);
    }

    @Then("I Verify the search")
    public void iVerifyTheSearch() {
        List<WebElement> each = BrowserUtils.getDriver().findElements(By.xpath("//td[text()='jhon']"));
        for(WebElement list: each){
            BrowserUtils.assertFalse(list.equals("jhon"));
        }

    }

    @Then("I edit the user registration form:")
    public void iEditTheUserRegistrationForm(Map<String, String> map) {
        for (String key : map.keySet()) {
            BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                    String.format(XPATH_TEMPLATE_INPUT_FIELD, key)
            )), map.get(key));
        }
    }


}
