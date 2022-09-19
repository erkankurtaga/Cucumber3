package StepDefinitions;

import Pages.DialogContent;
import Pages.GradeLevelsContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class CUC_10_GradeLevelsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    GradeLevelsContent gc= new GradeLevelsContent();
    String randomName = RandomStringUtils.randomAlphabetic(8);
    String istenenName = randomName;
    String randomShortName = RandomStringUtils.randomAlphabetic(4);
    String randomCode = RandomStringUtils.randomNumeric(2);

    Actions actions = new Actions(GWD.getDriver());


    @Then("user add Grade Levels")
    public void userAddGradeLevels() {
        waitUntilListLoading();
        dc.findAndClick("add");
        gc.waitPopUp();
        dc.findAndSend("name", istenenName);
        dc.findAndSend("shortName", randomShortName);
        gc.findAndSend("order", randomCode);
        gc.findAndClick("active");
        gc.findAndClick("saveButton");
       // dc.waitUntilLoading();
    }

    String randomNewName = RandomStringUtils.randomAlphabetic(8);
    String istenenNewName=randomNewName;
    String randomNewCode = RandomStringUtils.randomNumeric(2);
    @Then("user edit Grade Levels")
    public void userEditGradeLevels() {
        waitUntilListLoading();
        List<WebElement> listeNames = GWD.getDriver().findElements(By.xpath("//tbody[@role='rowgroup']/tr"));
        for (WebElement e : listeNames)
            if ((e.getText()).contains(istenenName)) {
                actions.moveToElement(e).click().build().perform();
                gc.waitPopUp();
                dc.findAndSend("name", istenenNewName);
                dc.findAndSend("shortName", "rand45");
                gc.findAndSend("order", randomNewCode);
                gc.findAndClick("active");
                gc.findAndClick("saveButton");
          //  dc.waitUntilLoading();
            }
    }

    @Then("user delete Grade Levels")
    public void userDeleteGradeLevels() {
        waitUntilElementListed(istenenName);
        List<WebElement> listNewNames = GWD.getDriver().findElements(By.xpath("//tbody[@role='rowgroup']/tr"));
        for (WebElement e : listNewNames){
           if ((e.getText()).contains(istenenNewName)) {
                List<WebElement> listDelete = GWD.getDriver().findElements(By.xpath("//ms-delete-button/button"));
                for (int i = 0; i < listDelete.size(); i++) {
                WebElement istenenDelet = listDelete.get(listNewNames.indexOf(e));
                actions.moveToElement(istenenDelet).click().build().perform();
                actions.moveToElement(gc.deleteDialogBtn).click().build().perform();
                break;}
               dc.waitUntilLoading();
          }
        }
    }
    @And("user should see successfully message")
    public void userShouldSeeSuccessfullyMessage() {
        gc.findAndContainsText("successMessage", "successfully");
    }

    private void waitUntilElementListed(String name) {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.xpath("//tbody//td[2][text()='" + name + "']"), 0));
    }

    private void waitUntilListLoading() {
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody[role='rowgroup'] > tr")));
    }

}




