package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath="//ms-add-button[@class=\"ng-star-inserted\"]//button")
     private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath="//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath="//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement deleteLast;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCokkiesButton;
    
    @FindBy(xpath="//mat-select[@formcontrolname='attachmentStages']")
    private WebElement stages;

    @FindBy(xpath="//mat-option")
    private List<WebElement> stageItem;

    @FindBy(xpath="//mat-option//span")
    private List<WebElement> stageItemText;
    @FindBy(xpath="//textarea[@formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME')]//input)")
    private WebElement searchName;

    @FindBy(xpath = "(//mat-Select) [1]")
    private WebElement searchStage;

    @FindBy(xpath = "//button//span[contains(text(),'Delete')]")
    private WebElement deleteButtonOk;
    
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacityInput;
    
    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname=\"iban\"]//input")
    private WebElement ibanInput;


    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"integrationCode\"]//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname=\"active\"]")
    private WebElement active;    

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

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

    @FindBy(xpath = "(//mat-select[@role='combobox']/div)[3]")
    private WebElement locationType;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement Classroom;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement Laboratory;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement Other;

    @FindBy(xpath = "(//mat-slide-toggle[@formcontrolname='active']/label/span)[1]")
    private WebElement deActive;

    @FindBy(xpath = "(//tbody[@role='rowgroup']/tr//td)[2]")
    private WebElement nameList;


    WebElement element;
    List<WebElement> elements;
    
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "username" : element = username; break;
            case "password" : element = password; break;
            case "name" : element = nameInput; break;
            case "shortName": element = shortNameInput; break;
            case "capacityInput": element = capacityInput; break;
            case "description" : element = description; break;
            case "searchName" : element = searchName; break;
            case "ibanInput": element = ibanInput; break;
            case "integrationCode": element = integrationCode; break;            
        }

        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "login" : element = loginButton; break;
            case "accept-cookies" : element = acceptCokkiesButton; break;
            case "search" : element = searchButton; break;
            case "add" : element = addButton; break;
            case "edit" : element = editButton; break;
            case "delete" : element = deleteButton; break;
            case "stages" : element = stages; break;
            case "deleteOk" : element = deleteButtonOk; break;
            case "save" : element = saveButton; break;
            case "locationType" : element = locationType; break;
            case "Classroom" : element = Classroom; break;
            case "Laboratory" : element = Laboratory; break;
            case "Other" : element = Other; break;
            case "deActive" : element = deActive; break;
            case "deleteLast" : element= deleteLast;break;
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
