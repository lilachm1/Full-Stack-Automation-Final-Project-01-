package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdministrationPage {

    @FindBy (how = How.XPATH, using = "//button[@value='INIT']")
    public WebElement initialize_button;
}


