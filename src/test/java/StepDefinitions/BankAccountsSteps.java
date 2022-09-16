package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import com.mongodb.client.model.geojson.LineString;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class BankAccountsSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            ln.findAndClick(listElement.get(i));
        }
    }

    @And("User new Bank Account item from in the Dialog")
    public void userNewBankAccountItemFromInTheDialog(DataTable elements) {

        List<List<String>> listElement=elements.asLists(String.class);

        for (int i=0;i<listElement.size();i++){

                 dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @And("Success massage should be displayed")
    public void successMassageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage", "Account");
    }

    @And("Click on the element in the Add Bank Account")
    public void clickOnTheElementInTheAddBankAccount(DataTable elements) {

        List<String> listElement= elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            GWD.Bekle(2);
            dc.findAndClick(listElement.get(i));

        }
    }


    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<List<String>> listElement=elements.asLists(String.class);

        for (int i=0;i<listElement.size();i++){

            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }

    }
}