package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AddNewDashboardPage {

    public AddNewDashboardPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//input[@placeholder='New dashboard']")
    public WebElement inputName;

    @FindBy(xpath = "//button[normalize-space()='New board']")
    public WebElement newdashboard;

}
