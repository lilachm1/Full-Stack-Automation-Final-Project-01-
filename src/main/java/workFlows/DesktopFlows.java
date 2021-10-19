package workFlows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class DesktopFlows extends CommonOps {

    @Step("Business Flow: Calculate Subtraction: 4-2")
    public static void CalculateSubtraction()

    {
        UIActions.click(calcMaim.btn_clear);
        UIActions.click(calcMaim.btn_four);
        UIActions.click(calcMaim.btn_minus);
        UIActions.click(calcMaim.btn_two);
        UIActions.click(calcMaim.btn_equals);
        UIActions.click(calcMaim.filed_result);



    }
}
