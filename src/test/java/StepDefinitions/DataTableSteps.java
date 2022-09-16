package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


import java.util.List;

public class DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog Content")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        GWD.Bekle(2);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }


    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "success");

    }

    @And("Delete on the element in the Dialog Content")
    public void deleteOnTheElementInTheDialogContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        GWD.Bekle(3);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }


}