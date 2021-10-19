package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class leftmenuPage {

    @FindBy(how = How.CLASS_NAME ,using = "leftmenu")
    public List<WebElement> list_leftmenu;


}
