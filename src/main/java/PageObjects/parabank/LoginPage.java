package PageObjects.parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy (how = How.NAME, using = "username")
    public WebElement txt_username;


    @FindBy (how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy (how = How.XPATH, using = "// input[@class='button']")
    public WebElement login_button;


    @FindBy(how = How.LINK_TEXT, using = "Admin Page")
    public WebElement adminPage_Btn;









}
