package workFlows;

import utilities.CommonOps;
import extensions.MobileActions;

import io.qameta.allure.Step;


public class MobileFlows extends CommonOps {


    @Step("Business Flow: Login")
    public static void login(String user, String pass) {
        MobileActions.updateText(experibankLogin.txt_user, user);
        MobileActions.updateText(experibankLogin.txt_pass, pass);
        MobileActions.click(experibankLogin.login_btn);

    }

    @Step("Business Flow: Make Payment")
    public static void makePayment(String phone, String name, String amount) {
        MobileActions.tap(1, experibankMain.makePayment_btn, 500);
        MobileActions.updateText(experibankPayment.phone_txt, phone);
        MobileActions.updateText(experibankPayment.name_txt, name);
        MobileActions.updateText(experibankPayment.amount_txt, amount);
        MobileActions.click(experibankPayment.country_btn);
        MobileActions.click(experibankCountry.country_txt);
        MobileActions.click(experibankPayment.sendPayment_btn);
        MobileActions.click(experibankPayment.confirm_btn);


    }
}
