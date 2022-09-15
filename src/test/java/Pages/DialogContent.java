package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id="mat-input-0")
    private WebElement username;
    @FindBy(id="mat-input-1")
    private WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath="//button[@matbadgecolor='accent']")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath="//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookiesButton;
    @FindBy(xpath="//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stages;

    @FindBy(xpath="//mat-option")
    private List<WebElement> stageItem;

    @FindBy(xpath="//mat-option//span")
    private List<WebElement> stageItemText;
    @FindBy(xpath="//textarea[@formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']")
    private WebElement searchName;

    @FindBy(xpath = "(//mat-Select) [1]")
    private WebElement searchStage;

    @FindBy(xpath = "//button//span[contains(text(),'Delete')]")
    private WebElement deleteButtonOk;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    WebElement element;
    List<WebElement> elements;
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "username" : element = username; break;
            case "password" : element = password; break;
            case "name" : element = nameInput; break;
            case "shortName": element = shortNameInput; break;
            case "description" : element = description; break;
            case "searchName" : element = searchName; break;
        }

        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "login" : element = loginButton; break;
            case "accept-cookies" : element = acceptCookiesButton; break;
            case "search" : element = searchButton; break;
            case "add" : element = addButton; break;
            case "edit" : element = editButton; break;
            case "delete" : element = deleteButton; break;
            case "stages" : element = stages; break;
            case "deleteOk" : element = deleteButtonOk; break;
            case "save" : element = saveButton; break;
        }

        clickFunction(element);
    }

    public void findAndSelect(String strElement, String value) {
        switch (strElement) {
            case "stages-select":
                findAndClick("stages");

                for (int i = 0; i < stageItemText.size(); i++) {
                    if(stageItemText.get(i).getText().equals(value)){
                        clickFunction(stageItem.get(i));
                        sendKeyBoard("ESC");
                        break;
                    }
                }

                break;
        }
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement){
            case "dashboard" : element = dashboard; break;
            case "success" : element = successMessage; break;
        }

        verifyContainsText(element,text);
    }

    public void searchAndEdit(String searchText){
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("search");

        waitUntilLoading();

        findAndClick("edit");
    }

    public void searchAndDelete(String searchText){
        scrollUp();
        scrollToElement(searchName);
        findAndSend("searchName", searchText);
        findAndClick("search");

        waitUntilLoading();

        findAndClick("delete");
        findAndClick("deleteOk");
    }












}
