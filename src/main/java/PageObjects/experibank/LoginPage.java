package PageObjects.experibank;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private AppiumDriver mobileDriver;
    public LoginPage (AppiumDriver mobileDriver)
    {
        this.mobileDriver = mobileDriver;
       PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @AndroidFindBy(id = "usernameTextField")
    public AndroidElement txt_user;


    @AndroidFindBy(id = "passwordTextField")
    public AndroidElement txt_pass;


    @AndroidFindBy(id = "loginButton")
    public AndroidElement login_btn;

}


