package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FilterUserPage {

    public FilterUserPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    public WebElement filterBtn;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBtn;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement searchBTn2;


}
