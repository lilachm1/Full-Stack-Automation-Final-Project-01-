package utilities;

import PageObjects.parabank.*;
import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    // General

    protected static WebDriverWait wait;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static Actions action;
    protected static String platform;

    // WEb
    protected static WebDriver driver;

    // Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();

// RestApi

    protected static   RequestSpecification httpRequest;
    protected static  Response response;
    protected static JSONObject Params = new JSONObject();
    protected static JsonPath jp;

    // Database

    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;

    // page objects - WEb
    protected static PageObjects.parabank.LoginPage parabankLogin;
    protected static AccountOverviewPage parabankOverview;
    protected static AccountServicesPage parabankAccountServices;
    protected static OpenNewAccountPage parabankOpenNewAccount;
    protected static AccountOpenedPage parabankAccountOpened;
    protected static ApplyForAloanPage parabankApplyForAloan;
    protected static LoanRequestProcessedPage parabankLoanRequestProcessed;
    protected static HeaderPanelPage parabankHeaderPanel;
    protected static CustomerCarePage parabankCustomerCare;
    protected static CustomerCareConfirmPage parabankCustomerCareConfirm;
    protected static leftmenuPage parabankleftmenu;
    protected static AdministrationPage parabankAdministration;

    // page objects - mobile
    protected static  PageObjects.experibank.LoginPage experibankLogin;
    protected static PageObjects.experibank.MainPage experibankMain;
    protected static PageObjects.experibank.PaymentPage experibankPayment;
    protected static PageObjects.experibank.CountryPage experibankCountry;

    // page objects - Electron
    protected static PageObjects.electronApiDemos.LeftMainMenuPage electronApiDemoLeftMainMenu;
    protected static PageObjects.electronApiDemos.CustomizeMenusPage electronApiDemoCustomizeMenus;
    protected static PageObjects.electronApiDemos.HandlingWindowPage electronApiDemoHandlingWindow;

    // page objects -Desktop
    protected static PageObjects.calculator.MainPage calcMaim;

}



















