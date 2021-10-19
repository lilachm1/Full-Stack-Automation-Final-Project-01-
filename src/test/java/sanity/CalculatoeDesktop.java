package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatoeDesktop extends CommonOps {

    @Test(description = "Test01 - Verify Subtraction Command")
    @Description("This Test verifies the Subtraction Command")
    public void test01_VerifySubtractionCommand() {
        DesktopFlows.CalculateSubtraction();
        Verifications.VerificationTextInElement(calcMaim.filed_result, "Display is 2");
    }
}
