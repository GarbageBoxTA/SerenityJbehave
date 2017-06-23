package mycompany.com.pages;


import mycompany.com.core.page.WebPage;
import mycompany.com.fragments.AccountMenuFragment;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;

/**
 * Created by Denys_Shmyhin on 11/11/2016.
 */
public class AnyPage extends WebPage {

    public AnyPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@class='menu-container']")
    AccountMenuFragment accountMenu;

    public AccountMenuFragment getMenu(){
        return accountMenu;
    }
}
