package mycompany.com.steps.jbehave;

import mycompany.com.steps.serenity.HomePageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

/**
 * Created by kobsar on 6/23/2017.
 */

public class HomePageDefinitionsSteps {

    @Steps
    private HomePageSteps homePageSteps;

    @Given("the unsigned user accesses the google home page")
    public void unsignedUserIsOnHomePage(){
        homePageSteps.unsignedUserInHomePage();
    }

    @When("user searches some data: $exampleTable")
    public void search(ExamplesTable table){
        boolean replaceNamedParameters = true;
        String value = table.getRowAsParameters(0, replaceNamedParameters).valueAs("data", String.class);
        homePageSteps.doSearch(value);
    }

}
