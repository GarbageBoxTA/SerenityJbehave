package mycompany.com.fragments;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

/**
 *
 */

public class AccountMenuFragmentImpl extends WidgetObjectImpl implements AccountMenuFragment {

    public AccountMenuFragmentImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public AccountMenuFragmentImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @FindBy(xpath = "//*[@id=\"gb_70\"]")
    WebElementFacade loginBtn;

    @FindBy(xpath = "")
    WebElementFacade byEmailLink;

    @FindBy(xpath = "")
    WebElementFacade loginPopUpBtn;

    @FindBy(xpath = "")
    WebElementFacade emailInput;

    @FindBy
    WebElementFacade passwordInput;





}
