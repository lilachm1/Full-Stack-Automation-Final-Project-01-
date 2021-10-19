package workFlows;

import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ElectronFlows extends CommonOps {

    @Step("Business Flow: Handling Window Crashes and Hangs")
    public static void Handling_Window_Crashes_and_Hangs ()
              {
                  UIActions.click(electronApiDemoLeftMainMenu.btn_crash_hang);
                  UIActions.click(electronApiDemoHandlingWindow.btn_new_window_hangs_demo);
                  Verifications.EnabledOfElements(electronApiDemoHandlingWindow.btn_demo);


    }

    @Step("Business Flow: Customize Menus")
    public static void Customize_Menus ()
    {
        UIActions.click(electronApiDemoLeftMainMenu.btn_menus);
        UIActions.click(electronApiDemoCustomizeMenus.btn_application_menu_demo_toggle);
        Verifications.VisebilityOfElements(electronApiDemoCustomizeMenus.btn_context_menu_demo_toggle);
    }
}


