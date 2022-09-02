package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy()
    private WebElement x;


    WebElement element;
    public void findAndClick(String strElement){
        switch (strElement){

        }

        clickFunction(element);
    }

}
