package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class CUC_03_DocumentTypesSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for(int i=0; i < elementList.size();i++) {
            ln.findAndClick(elementList.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for(int i=0; i < elementList.size();i++) {
            dc.findAndClick(elementList.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
       List<List<String>> elementList = elements.asLists(String.class);

        for(int i=0;i<elementList.size();i++) {
            if (elementList.get(i).get(0).contains("-select"))
                dc.findAndSelect(elementList.get(i).get(0), elementList.get(i).get(1));
            else
                dc.findAndSend(elementList.get(i).get(0), elementList.get(i).get(1));
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("success","success");
    }

    @And("User Edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<List<String>> elementList = elements.asLists(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(i+"=> 0="+elementList.get(i).get(0) +" ; 1="+ elementList.get(i).get(1));
        }

        dc.searchAndEdit(elementList.get(0).get(1));

        for (int i = 1; i < elementList.size(); i++) {
            dc.findAndSend(elementList.get(i).get(0),elementList.get(i).get(1));
        }
    }

    @And("User Delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            dc.searchAndDelete(elementList.get(i));
        }

    }
}
