package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerCarePage {

    @FindBy(how = How.ID, using = "name")
    public WebElement name_txt;

    @FindBy(how = How.ID, using = "email")
    public WebElement email_txt;

    @FindBy(how = How.ID, using = "phone")
    public WebElement phone_txt;

    @FindBy(how = How.ID, using = "message")
    public WebElement message_txt;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    public WebElement SendtoCustomerCare_btn;










}
