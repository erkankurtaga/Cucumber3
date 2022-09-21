package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    private WebElement documentTypes;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccounts;

    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanSetup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
    private WebElement attestations;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategories;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement educationSetup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategories;

    WebElement element;
    public void findAndClick(String strElement){
        switch (strElement){
            case "setup" : element = setup; break;
            case "parameters" : element = parameters; break;
            case "nationalities" : element = nationalities; break;
            case "discounts" : element = discounts; break;
            case "grade-levels" : element = gradeLevels; break;
            case "document-types" : element = documentTypes; break;
            case "bankAccounts": element = bankAccounts; break;
            case "fields" : element = fields; break;
            case "school-setup" : element = schoolSetup; break;
            case "locations" : element = locations; break;
            case "departments" : element = departments; break;
            case "human-resources" : element = humanResources; break;
            case "human-setup" : element = humanSetup; break;
            case "positions" : element = positions; break;
            case "attestations" : element = attestations; break;
            case "position-categories" : element = positionCategories; break;
            case "education" : element = education; break;
            case "education-setup" : element = educationSetup; break;
            case "subject-categories" : element = subjectCategories; break;
        }

        clickFunction(element);
    }

}
