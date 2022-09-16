package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath="//ms-add-button[@class=\"ng-star-inserted\"]//button")   // locater değiştirdim
     private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath="//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button")
    private WebElement acceptCokkiesButton;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname=\"iban\"]//input")
    private WebElement ibanInput;


    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"integrationCode\"]//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname=\"active\"]")
    private WebElement active;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME')]//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//mat-select[@formcontrolname=\"currency\"]")
    private WebElement currencySelect;

    @FindBy(xpath = "(//mat-option[@role=\"option\"]//span)[1]")
    private WebElement currencyKZT;


    @FindBy(xpath = "(//mat-option[@role=\"option\"]//span)[2]")
    private WebElement currencyUSD;


    @FindBy(xpath = "(//mat-option[@role=\"option\"]//span)[3]")
    private WebElement currencyEUR;


    @FindBy(xpath = "(//mat-option[@role=\"option\"]//span)[4]")
    private WebElement currencyTRY;

    @FindBy(xpath = "(//mat-option[@role=\"option\"]//span)[5]")
    private WebElement currencyPKR;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement deleteButtonTwo;


    WebElement element;
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "username" : element = username; break;
            case "password" : element = password; break;
            case "nameInput" : element = nameInput; break;
            case "shortName": element = shortNameInput; break;
            case "ibanInput": element = ibanInput; break;
            case "integrationCode": element = integrationCode; break;
            case "searchNameInput": element = searchNameInput; break;
        }

        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "login" : element = loginButton; break;
            case "accept-cookies" : element = acceptCokkiesButton; break;
            case "search" : element = searchButton; break;
            case "addButton" : element = addButton; break;
            case "editButton" : element = editButton; break;
            case "delete" : element = deleteButton; break;
            case "saveButton" : element = saveButton; break;
            case "currencySelect" : element = currencySelect; break;
            case "currencyKZT" : element = currencyKZT; break;
            case "currencyUSD" : element = currencyUSD; break;
            case "currencyEUR" : element = currencyEUR; break;
            case "currencyTRY" : element = currencyTRY; break;
            case "currencyPKR" : element = currencyPKR; break;
            case "deleteButtonTwo" : element = deleteButtonTwo; break;


        }

        clickFunction(element);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement){
            case "dashboard" : element =dashboard; break;
            case "successMessage" : element =successMessage; break;
        }

        verifyContainsText(element,text);
    }

}
