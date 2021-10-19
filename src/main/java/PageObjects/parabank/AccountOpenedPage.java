package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountOpenedPage {

    @FindBy(how = How.XPATH, using = "//h1[text()='Account Opened!']")
    public WebElement header_AccountOpened;

    @FindBy(how = How.XPATH, using = "//b[text()='Your new account number:']")
    public WebElement newAccountNnumber_txt;

    @FindBy(how = How.ID, using = "newAccountId")
    public WebElement newAccountId_txt;










}
