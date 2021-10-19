package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ApplyForAloanPage {

    @FindBy(how = How.ID, using = "amount")
    public WebElement amount_txt;

    @FindBy(how = How.ID, using = "downPayment")
    public WebElement downPayment_txt;

    @FindBy(how = How.ID, using = "fromAccountId")
    public WebElement fromAccountId_SelectedOption;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    public WebElement ApplyNow_btn;






}



