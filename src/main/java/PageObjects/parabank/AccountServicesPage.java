package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountServicesPage {

    @FindBy(how = How.LINK_TEXT, using = "Open New Account")
    public WebElement NewAccout_Btn;

    @FindBy(how = How.LINK_TEXT, using = "Transfer Funds")
    public WebElement TransferFunds_Btn;

    @FindBy(how = How.LINK_TEXT, using = "Request Loan")
    public WebElement RequestLoan_Btn;

    @FindBy(how = How.LINK_TEXT, using = "Log Out")
    public WebElement LogOut_Btn;

  @FindBy(how = How.XPATH, using ="//h2[text()='Account Services']")
 public WebElement Header_Txt;


  //  @FindBy(how = How.XPATH, using ="//p[@class='smallText']")
 //   public WebElement smallText_Txt;






}
