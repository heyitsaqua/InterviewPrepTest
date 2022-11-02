package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AddNewUserPage {
    public AddNewUserPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='mr-4']")
    public WebElement manageAccesBtn;

    @FindBy(id = "Role")
    public WebElement selectRole;

    @FindBy(id = "Batch")
    public WebElement selectBatch;

}
