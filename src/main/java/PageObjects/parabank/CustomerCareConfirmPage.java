package PageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerCareConfirmPage {

    @FindBy(how = How.CLASS_NAME, using = "title")
    public WebElement CustomerCare_title;


    @FindBy(how = How.XPATH, using = "//p[text()='A Customer Care Representative will be contacting you.']")
    public WebElement CustomerCare_p;




}
