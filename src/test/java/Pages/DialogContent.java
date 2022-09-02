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

    WebElement element;
    public void findAndSend(String strElement, String value){
        switch (strElement){
            case "username" : element =username; break;
            case "password" : element =password; break;
        }

        sendKeysFunction(element, value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton" : element =loginButton; break;
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
