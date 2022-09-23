package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.When;
import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import java.util.List;

public class CUC_08_PositionsSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User searches for the desired item in the Dialog Content")
    public void userSearchesForTheDesiredItemInTheDialogContent(DataTable elements) {
        List<List<String>> listElement =elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

}
