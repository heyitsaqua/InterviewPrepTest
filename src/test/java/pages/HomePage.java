package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "inputArea1")
    public WebElement doInput;

    @FindBy(id = "inputArea2")
    public WebElement dontInput;

    @FindBy(linkText = "Add don't ")
    public WebElement addDontBtn;

    @FindBy(id = "question")
    public WebElement addQuestionBtn;

    @FindBy(xpath = "//p/parent::a/following-sibling::span/child::button")
    public WebElement questionDeleteBtn;
}
