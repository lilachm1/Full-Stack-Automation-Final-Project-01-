package PageObjects.electronApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HandlingWindowPage {

    @FindBy(how = How.ID, using = "new-window-hangs-demo-toggle")
    public WebElement btn_new_window_hangs_demo;


  @FindBy(how = How.CLASS_NAME, using = "demo-button")
   public WebElement btn_demo;





}
