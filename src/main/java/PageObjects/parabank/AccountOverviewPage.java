package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountOverviewPage {

    @FindBy(how = How.XPATH, using = "// div[@class='ng-scope']/h1")
    public WebElement headerText;
}
