package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpenNewAccountPage {

    @FindBy(how = How.ID, using = "type")
    public WebElement types_SelectedOption;

    @FindBy(how = How.ID, using = "fromAccountId")
    public WebElement accounts_SelectedOption;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    public WebElement OpenNewAccount_btn;




}
