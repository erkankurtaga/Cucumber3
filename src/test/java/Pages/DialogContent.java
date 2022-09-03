package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath="//button[@matbadgecolor=\"accent\"]")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname=\"name\"]/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname=\"shortName\"]/input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath="//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button")
    private WebElement acceptCokkiesButton;


    WebElement element;
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "username" : element = username; break;
            case "password" : element = password; break;
            case "name"     : element = nameInput; break;
            case "shortName": element = shortNameInput; break;
        }

        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "login"  : element = loginButton; break;
            case "acceptCokkies" : element = acceptCokkiesButton; break;
            case "search" : element = searchButton; break;
            case "add"    : element = addButton; break;
            case "edit"   : element = editButton; break;
            case "delete" : element = deleteButton; break;
        }

        clickFunction(element);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement){
            case "dashboard" : element =dashboard; break;
        }

        verifyContainsText(element,text);
    }













}
