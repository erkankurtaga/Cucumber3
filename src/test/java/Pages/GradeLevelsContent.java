package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class GradeLevelsContent extends Parent{
    public GradeLevelsContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath="//ms-text-field[@formcontrolname='order']/input")
    private WebElement orderInput;
    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    private WebElement active;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;
    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    public WebElement GraneLevelsLaod;

    @FindBy(xpath = "((//ms-text-field/input)[1]")
    private WebElement descriptionInput;

    @FindBy(xpath = "((//ms-text-field/input)[3]")
    private WebElement descriptiondialog;

    @FindBy(xpath = "((//ms-text-field/input)[4]")
    private WebElement intergrationCode;

    @FindBy(xpath = "//ms-integer-field/input")
    private WebElement priority;
    WebElement element;
    public void findAndSend(String strElement, String value){
        switch (strElement){

            case "order" : element = orderInput; break;
            case "searchInput" : element =searchInput; break;
            case "descriptionInput" : element = descriptionInput; break;
            case "descriptiondialog" : element =descriptiondialog; break;
            case "intergrationCode" : element = intergrationCode; break;
            case "priority" : element =priority; break;
        }

        sendKeysFunction(element, value);
    }
    public void findAndClick(String strElement){
        switch (strElement){

            case "saveButton": element = saveButton; break;
            case "active" : element = active; break;
            case "searchButton" : element =searchButton; break;
            case "deleteButton" : element =deleteButton; break;
            case "deleteDialogBtn" : element=deleteDialogBtn; break;
        }

        clickFunction(element);
    }
    public void findAndContainsText(String strElement, String text){
        switch (strElement){

            case "successMessage" : element =successMessage; break;
        }

        verifyContainsText(element,text);
    }



    public void waitPopUp() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.attributeContains(By.className("cdk-overlay-pane"), "style", "static"));
    }
}
