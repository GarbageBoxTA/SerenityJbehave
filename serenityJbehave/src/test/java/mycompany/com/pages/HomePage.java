package mycompany.com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 */
@DefaultUrl("https://www.google.com.ua")
public class HomePage extends AnyPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='btnK']")
    WebElementFacade searchBtn;

    @FindBy(xpath = "//*[@id='lst-ib']")
    WebElementFacade searchInput;

    public void clickSearchBtn(){
        searchBtn.waitUntilClickable().click();
    }

    public void setSearchInput(String value){
        searchInput.withTimeoutOf(5, SECONDS).waitUntilVisible().clear();
        searchInput.typeAndEnter(value);
    }

}


