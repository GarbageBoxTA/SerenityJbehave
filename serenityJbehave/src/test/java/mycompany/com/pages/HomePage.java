package mycompany.com.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 *
 */
@At(urls = { "#HOST/#/" })
@DefaultUrl("https://www.google.com.ua/")
public class HomePage extends AnyPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    WebElementFacade loginBtn;



}


