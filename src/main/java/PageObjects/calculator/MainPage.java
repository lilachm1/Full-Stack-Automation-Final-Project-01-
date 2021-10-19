package PageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.NAME, using = "Two")
    public WebElement btn_two;

    @FindBy(how = How.NAME, using = "Four")
    public WebElement btn_four;

    @FindBy(how = How.NAME, using = "Minus")
    public WebElement btn_minus;

    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement filed_result;

    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_clear;
}
