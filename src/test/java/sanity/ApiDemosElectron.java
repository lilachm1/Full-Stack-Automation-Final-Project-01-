package sanity;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class ApiDemosElectron extends CommonOps {

    @Test(description = "Test01 -Verify the: View Demo Button")
    @Description("This Test Verifies  the: View Demo Button After We Pressed on - Button-Crash-Hang ")
    public void test01_verifyHeader() {
        ElectronFlows.Handling_Window_Crashes_and_Hangs();

    }


    @Test(description = "Test02 -Verify Context_Menu_Demo_Toggle Button")
    @Description("This Test Verifies the :Context_Menu_Demo_Toggle Button After We Pressed on -  Button-menus ")
    public void test02_verifyHeader() {
        ElectronFlows.Customize_Menus();
    }
}
