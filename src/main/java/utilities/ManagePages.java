package utilities;

import PageObjects.parabank.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    /*
    ##################################################################
    This method initiates web elements on pages. Used POM (Page Object Model)
        ##################################################################
     */

   public static void initParabank() {
      parabankLogin = PageFactory.initElements(driver, PageObjects.parabank.LoginPage.class);
      parabankOverview = PageFactory.initElements(driver, AccountOverviewPage.class);
      parabankAccountServices = PageFactory.initElements(driver, AccountServicesPage.class);
      parabankOpenNewAccount = PageFactory.initElements(driver, OpenNewAccountPage.class);
      parabankAccountOpened = PageFactory.initElements(driver, AccountOpenedPage.class);
      parabankApplyForAloan = PageFactory.initElements(driver, ApplyForAloanPage.class);
      parabankLoanRequestProcessed = PageFactory.initElements(driver, LoanRequestProcessedPage.class);
      parabankHeaderPanel = PageFactory.initElements(driver, HeaderPanelPage.class);
      parabankCustomerCare = PageFactory.initElements(driver, CustomerCarePage.class);
      parabankCustomerCareConfirm = PageFactory.initElements(driver, CustomerCareConfirmPage.class);
      parabankleftmenu = PageFactory.initElements(driver, leftmenuPage.class);
      parabankAdministration = PageFactory.initElements(driver, AdministrationPage.class);

   }

   /*
    ##################################################################
    This method initiates mobile elements on App. Used POM (Page Object Model)
        ##################################################################
     */

   public static void initExperibank() {
      experibankLogin = new PageObjects.experibank.LoginPage(mobileDriver);
      experibankMain = new PageObjects.experibank.MainPage(mobileDriver);
      experibankPayment = new PageObjects.experibank.PaymentPage(mobileDriver);
      experibankCountry = new PageObjects.experibank.CountryPage(mobileDriver);

   }

   /*
    ##################################################################
    This method initiates web elements on Electron App. Used POM (Page Object Model)
        ##################################################################
     */
   public static void initElectronApiDemo() {
      electronApiDemoLeftMainMenu = PageFactory.initElements(driver, PageObjects.electronApiDemos.LeftMainMenuPage.class);
      electronApiDemoCustomizeMenus = PageFactory.initElements(driver, PageObjects.electronApiDemos.CustomizeMenusPage.class);
      electronApiDemoHandlingWindow = PageFactory.initElements(driver, PageObjects.electronApiDemos.HandlingWindowPage.class);


   }

   /*
    ##################################################################
    This method initiates web elements on Desktop App. Used POM (Page Object Model)
        ##################################################################
     */

   public static void initCalculator() {
      calcMaim = PageFactory.initElements(driver, PageObjects.calculator.MainPage.class);
   }
}

