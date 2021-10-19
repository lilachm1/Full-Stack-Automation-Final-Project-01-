package sanity;

import utilities.CommonOps;
import extensions.MobileActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import workFlows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class ExperibankMobile extends CommonOps {


    @Test(description = "Test01 - Verify Balance Text")
    @Description("This Test login and make payment ")
    public void test01_VerifyBalanceText() {
        MobileFlows.login("company", "company");
        MobileFlows.makePayment("0526623377", "lilach", "100");
        Verifications.VisebilityOfElements(experibankMain.balance_txt);
        MobileActions.click(experibankMain.logout_btn);

    }
}
