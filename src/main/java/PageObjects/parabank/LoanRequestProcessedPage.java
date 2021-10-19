package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanRequestProcessedPage {

    @FindBy(how = How.XPATH, using = "//h1[text()='Loan Request Processed']")
    public WebElement LoanRequestProcessed_title;

    @FindBy(how = How.XPATH, using = "//p[text()='Congratulations, your loan has been approved.']")
    public WebElement loanResponse_message;

    @FindBy(how = How.XPATH, using = "//div[@class='ng-scope']/h1")
    public WebElement LoanRequestProcessedEror_title;







}
