package mycompany.com.steps.serenity;

import mycompany.com.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by kobsar on 6/23/2017.
 */
public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public  HomePageSteps logIn(){
        return new HomePageSteps();
    }

    public void unsignedUserInHomePage() {
        homePage.open();
        homePage.waitForPageToLoad();
    }

    @Step
    public HomePageSteps doSearch(String searchValue){
        homePage.setSearchInput(searchValue);
       // homePage.clickSearchBtn();
        return new HomePageSteps();
    }

}


