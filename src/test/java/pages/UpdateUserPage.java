package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class UpdateUserPage {
    public UpdateUserPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='modal-content']//div//input[@id='Firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//button[@class='btn btn-danger mt-3']")
    public WebElement deleteBTn;


}
