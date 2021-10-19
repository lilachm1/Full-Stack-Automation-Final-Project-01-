package utilities;
import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import workFlows.WebFlows;

public class CommonOps extends Base
{
    /*
    ##################################################################
    This Method get the data from xml configuration file
    Receives Parameters : String and Return : String from DataConfig.xml file
    ##################################################################
    */
    public static String getData(String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

  /*
   ##################################################################
   This method is used to start a browser session and maximizes browser's window
  (depended browser type - the method receives desired browser type)
  Then it calls to another method to initiate PageObjects of parabank (elements on page)
  Then it calls to AdminPage button to make Database Initialized to parabank
  Then it calls to login to  parabank  withDB Credentials that
  taken from DataConfig.xml file
  It call to the to login method localized here to prevent depends at the Web Test Cases
   ##################################################################
    */
    public static void intBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver = intChromeDriver();
        else
        if (browserType.equalsIgnoreCase("firefox"))
            driver = intFirefoxDriver();
        else
        if (browserType.equalsIgnoreCase("ie"))
            driver = intIEDriver();
        else
            throw new RuntimeException("Invalid Browser Type ");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        driver.get(getData("Url"));
        ManagePages.initParabank();
       WebFlows.adminPage();
 WebFlows.loginDB();
// WebFlows.login("john","demo");
        action = new Actions(driver);

    }

/*
   ##################################################################
 This method is used to initiate Chrome WebDriver and returns it to initBrowser method, to start a session
   ##################################################################
 */
    public static WebDriver intChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    /*
   ##################################################################
 This method is used to initiate Firefox WebDriver and returns it to initBrowser method, to start a session
   ##################################################################
 */
    public static WebDriver intFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    /*
 ##################################################################
This method is used to initiate Internet Explorer WebDriver and returns it to initBrowser method, to start a session
 ##################################################################
*/
    public static WebDriver intIEDriver() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

       /*
 ##################################################################
This method is used to initiate mobile WebDriver and sets mobile application to work
with(info from DataConfig.xml file)
Then it calls to another method to initiate PageObjects of Experibank (elements on page)
Used Appium Studio to work with mobile application -
 ##################################################################
*/

    public static void  intMobile()
    {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("AppPackage"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("AppActivity"));
        try {
            mobileDriver = new AndroidDriver<>(new URL(getData("AppiumServer")), dc);
        } catch (Exception e) {
            System.out.print("Can Not Connect To Appium Server: See Details" + e );
        }
        ManagePages.initExperibank();
        mobileDriver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(mobileDriver, Long.parseLong(getData("TimeOut")));
      //  action = new Actions(driver);

    }
          /*
 ##################################################################
This method is used to initiate Web API. RestAssured was selected to work with API
  ##################################################################
         */

    public static void  intAPI()
    {
        RestAssured.baseURI = getData("urlAPI");
        httpRequest = RestAssured.given();
    }

     /*
 ##################################################################
 This method is used to initiate Electron Driver to work with Electron application
 Then it calls to another method to initiate PageObjects of ElectronApiDemo (elements on page)
  ##################################################################
         */
    public static void intElectron() {
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        ManagePages.initElectronApiDemo();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);



    }
     /*
 ##################################################################
 This method is used to initiate Windows Driver to work with Desktop application
 Then it calls to another method to initiate PageObjects of CalculatorApp (elements on page)
 ##################################################################
         */
    public static void intDesktop()
    {
        dc.setCapability("app", getData("CalculatorApp"));
        try {
        //    driver = new WindowsDriver(new URL(getData("AppiumServerDesktop")),dc);
        } catch (Exception e) {
            System.out.println(" Can not connect to Appium Server, See details:" + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")),TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        ManagePages.initCalculator();
    }

      /*
 ##################################################################
 This method receives Platform parameter (web, API, desktop ,electron, mobile) and then calls
 another method to initiate its driver
 Also at the beginning it calls the method which initiates connection to DB with values
 taken from DataConfig.xml file
  ##################################################################
         */

    @BeforeClass
    @Parameters({"PlatformName"})
    public void startSession(String PlatformName)
    { ManageDB.openConnection(getData("DBURL"),getData("DBUserName"), getData("DBPassword"));

        platform=PlatformName;

              if (platform.equalsIgnoreCase("web"))
           intBrowser(getData("BrowserName"));

        else if (platform.equalsIgnoreCase("mobile"))
            intMobile();
        else if (platform.equalsIgnoreCase("api"))
            intAPI();
        else if (platform.equalsIgnoreCase("electron"))
            intElectron();
     //   else if (platform.equalsIgnoreCase("desktop"))
         //  intDesktop();
        else
            throw new RuntimeException("Invalid Platform Name");
        softAssert = new SoftAssert();
        screen = new Screen();
     //   ManageDB.openConnection(getData("DBURL"),getData("DBUserName"), getData("DBPassword"));





    }
    /*
##################################################################
This method is used to startRecord the test before its start only if its not API tests.
 ##################################################################
        */
    @BeforeMethod
    public void beformethood (Method method) {
        if (!platform.equalsIgnoreCase("api")) {
            try {
                MonteScreenRecorder.startRecord(method.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
##################################################################
This method is used to close connection with DB and for ending the session after
finishing tests run (not including API and Mobile tests)
 ##################################################################
        */
    @AfterClass
    public void closeSession() {
        ManageDB.closeConnection();
        if (!platform.equalsIgnoreCase("api")) {
            if (!platform.equalsIgnoreCase("mobile"))
                driver.quit();
            else
                mobileDriver.quit();
        }
    }

       /*
 ##################################################################
 This method is used to open Parabank MainPage after each test. Using URL from
  DataConfig.xml file (only in case when working with WebDriver)
  ##################################################################
         */
    @AfterMethod
    public void afterMthod()
    {        if (platform.equalsIgnoreCase("web"))
        driver.get(getData("Url"));
    }


}





