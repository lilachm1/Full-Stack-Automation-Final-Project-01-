package workFlows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Admin Page")
    public static void adminPage(){
        UIActions.click(parabankLogin.adminPage_Btn);
        UIActions.click(parabankAdministration.initialize_button);
    }


    @Step("Business Flow:Login to Parabank")
    public static void login(String user, String pass) {
        UIActions.updateText(parabankLogin.txt_username, user);
        UIActions.updateText(parabankLogin.txt_password, pass);
        UIActions.click(parabankLogin.login_button);
    }

        @Step("Business Flow:Login to Parabank with DB Credentials")
        public static void loginDB()
        {
         String query ="SELECT name, password FROM Employees WHERE id ='4'";
            List<String> cred = DBActions.getCredentials(query);
            UIActions.updateText(parabankLogin.txt_username, cred.get(0));
            UIActions.updateText(parabankLogin.txt_password, cred.get(1));
            UIActions.click(parabankLogin.login_button);


    }
    @Step("Business Flow:Open New Account")
    public static void openNewAccount ()
    { UIActions.click(parabankAccountServices.NewAccout_Btn);
        UIActions.updateDropDown(parabankOpenNewAccount.types_SelectedOption, "SAVINGS");
        UIActions.updateDropDown(parabankOpenNewAccount.accounts_SelectedOption, "13344");
        UIActions.click(parabankOpenNewAccount.OpenNewAccount_btn);




    }
    @Step("Business Flow:Request Loan")
public static void RequestLoan()
{
UIActions.click(parabankAccountServices.RequestLoan_Btn);
UIActions.updateText(parabankApplyForAloan.amount_txt, "1000");
UIActions.updateText(parabankApplyForAloan.downPayment_txt, "200");
UIActions.updateDropDown(parabankApplyForAloan.fromAccountId_SelectedOption, "12567");
UIActions.click(parabankApplyForAloan.ApplyNow_btn);
}

    @Step("Business Flow:Send To Customer Care")
public static void SendtoCustomerCare()
{
    UIActions.click(parabankHeaderPanel.contact_btn);
    UIActions.updateText(parabankCustomerCare.name_txt, "lilach");
    UIActions.updateText(parabankCustomerCare.email_txt, "lilachmor12@gmail.com");
    UIActions.updateText(parabankCustomerCare.phone_txt ,"0526623377");
    UIActions.updateText(parabankCustomerCare.message_txt ,"plese get back to me");
    UIActions.click(parabankCustomerCare.SendtoCustomerCare_btn);




}

    @Step("Business Flow:Verify Text In Element")
    public static void VerifyTextInElement(String amount, String payment) {
UIActions.click(parabankAccountServices.RequestLoan_Btn);
        UIActions.updateTextHuman(parabankApplyForAloan.amount_txt,amount);
        UIActions.updateTextHuman(parabankApplyForAloan.downPayment_txt, payment);
        UIActions.click(parabankApplyForAloan.ApplyNow_btn);


        if (amount.equalsIgnoreCase("0") && payment.equalsIgnoreCase("0"))
            Verifications.VerificationTextInElement(parabankLoanRequestProcessed.LoanRequestProcessedEror_title,"Apply for a Loan");
        else if (amount.equalsIgnoreCase("100") && payment.equalsIgnoreCase("50")) {
       // Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
            Verifications.VerificationTextInElement(parabankLoanRequestProcessed.LoanRequestProcessedEror_title,"Apply for a Loan");
        }
        else
            throw new RuntimeException("Invalid Expected Output Option in Data Driven Testing, sould be Apply for a Loan");

        }
    }







