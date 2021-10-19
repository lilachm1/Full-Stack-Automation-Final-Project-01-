package PageObjects.experibank;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PaymentPage {
    private AppiumDriver mobileDriver;
    public PaymentPage (AppiumDriver mobileDriver)
    {
        this.mobileDriver = mobileDriver;
       PageFactory.initElements(new AppiumFieldDecorator(mobileDriver,3, TimeUnit.SECONDS),this);
    }

    @AndroidFindBy(id = "phoneTextField")
    public AndroidElement phone_txt;


    @AndroidFindBy(id = "nameTextField")
    public AndroidElement name_txt;


    @AndroidFindBy(id = "amountTextField")
    public AndroidElement amount_txt;


    @AndroidFindBy(id = "countryButton")
    public AndroidElement country_btn;

    @AndroidFindBy(id = "sendPaymentButton")
    public AndroidElement sendPayment_btn;

    @AndroidFindBy(id = "button1")
    public AndroidElement confirm_btn;







}


