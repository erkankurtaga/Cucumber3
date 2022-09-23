package Pages;
import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Cuc8Dialog extends Parent{

    public Cuc8Dialog() {PageFactory.initElements(GWD.getDriver(), this);
    }
        @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
        private WebElement nameInput;

        @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
        private WebElement shortNameInput;


        WebElement element;
        public void findAndSend(String strElement, String value){
            switch (strElement){
                case "shortNameInput": element = shortNameInput; break;
            }

            sendKeysFunction(element, value);
        }

        public void findAndClick(String strElement){
            switch (strElement){
                case "nameInput" : element = nameInput; break;
                case "shortNameInput" : element = shortNameInput; break;
            }

            clickFunction(element);
        }

    }
