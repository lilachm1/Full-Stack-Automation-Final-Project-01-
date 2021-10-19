package PageObjects.electronApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomizeMenusPage {

    @FindBy(how = How.ID, using = "application-menu-demo-toggle")
    public WebElement btn_application_menu_demo_toggle;


    @FindBy(how = How.ID, using = "context-menu-demo-toggle")
    public WebElement btn_context_menu_demo_toggle;



}
