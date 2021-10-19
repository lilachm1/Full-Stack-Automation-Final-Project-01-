package PageObjects.electronApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftMainMenuPage {


    @FindBy(how = How.ID, using = "button-crash-hang")
    public WebElement btn_crash_hang;

    @FindBy(how = How.ID, using = "button-menus")
    public WebElement btn_menus;
}
