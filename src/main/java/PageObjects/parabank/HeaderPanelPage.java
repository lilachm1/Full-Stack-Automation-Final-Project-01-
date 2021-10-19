package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPanelPage {

    @FindBy(how = How.LINK_TEXT, using = "contact")
    public WebElement contact_btn;



}
