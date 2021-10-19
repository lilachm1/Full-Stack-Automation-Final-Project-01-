package sanity;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.WebFlows;

@Listeners(utilities.Listeners.class)
public class ParabankWeb extends CommonOps {

 //Test 01 - "Verify Header" : the VerificationTextInElement are going to fail Intentionally.
//its going to be AssertionError:to Give documentation for the report system for the screenshot and for the video recording
//  The AssertionError : Expected :kuku, Actual :Accounts Overview.


    @Test(description = "Test01 -Verify Header -Are going to fail Intentionally")
    @Description("This Test Verifies the Header :Accounts Overview After We log withDB Credentials - its going to be AssertionError to Give documentation for the report system for the screenshot and for the video recording. The AssertionError : Expected :kuku, Actual:Accounts Overview")
    public void test01_verifyHeader() {

        Verifications.VerificationTextInElement(parabankOverview.headerText, "kuku");
        // Accounts Overview

    }


    @Test(description = "Test02 - Verify Open New Account")
    @Description("This Test Open New Account And Verifies that the New account has been opened")
    public void test02_OpenNewAccount() {
        WebFlows.openNewAccount();
        Verifications.VerificationTextInElement(parabankAccountOpened.header_AccountOpened, "Account Opened!");
        Verifications.VerificationTextInElement(parabankAccountOpened.newAccountNnumber_txt, "Your new account number:");
        Verifications.VisebilityOfElements(parabankAccountOpened.newAccountId_txt);
    }


    @Test(description = "Test03 - Verify Request Loan")
    @Description("This Test Request Loan and Verifies That The request has been sent")
    public void test03_RequestLoan() {
        WebFlows.RequestLoan();
        Verifications.VisebilityOfElements(parabankLoanRequestProcessed.LoanRequestProcessedEror_title);
     //   Verifications.VisebilityOfElements(parabankLoanRequestProcessed.LoanRequestProcessed_title);
  //   Verifications.VisebilityOfElements(parabankLoanRequestProcessed.loanResponse_message);
    }

   @Test(description = "Test 04 - Send To Customer Care")
    @Description("This Test send massage to Customer Care and Verifies That the message has been sent")
    public void test04_SendtoCustomerCare() {
        WebFlows.SendtoCustomerCare();
        Verifications.VisebilityOfElements(parabankCustomerCareConfirm.CustomerCare_title);
        Verifications.VerificationTextInElement(parabankCustomerCareConfirm.CustomerCare_p, "A Customer Care Representative will be contacting you.");

    }

   @Test(description = "Test 05 - Visibility Of Elements")
    @Description("This Test Verifies That the Default Left Menu is displayed (using soft assertions)")
    public void test05_VisibilityOfElements() {
        Verifications.VisebilityOfListElements(parabankleftmenu.list_leftmenu);
    }


    @Test(description = "Test06 - Verify Parabank Icon")
    @Description("This Test  verifies the Parabank Image using Sikuli Tool")
    public void test06_VerifyParabankIcon() {
        Verifications.VisualElement("Parabank");
    }


    @Test(description ="Test07 - Verify Request Loan", dataProvider = "data-provider loan Amount and down payment",dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test Request Loan and Verifies That The request has been sent Using DDT")
    public void test07_VerifyRequestLoan(String amount, String payment) {

               WebFlows.VerifyTextInElement(amount, payment);



    }
}



