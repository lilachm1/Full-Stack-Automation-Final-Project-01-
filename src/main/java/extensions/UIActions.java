package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Clik On Element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();

    }

    @Step("UpdateText On Element")
    public static void updateText(WebElement elem, String text) {


        {
            wait.until(ExpectedConditions.visibilityOf(elem));
            elem.sendKeys(text);
        }
    }


    @Step("UpdateText on Element as Human")
    public static void updateTextHuman(WebElement elem, String text) {
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
            for (char ch : text.toCharArray())
            {
                Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
                elem.sendKeys(ch + "");
            }
        }
    }

    @Step("Update DropDown Element")
        public static void updateDropDown (WebElement elem, String text)
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
            Select dropDown = new Select(elem);
            dropDown.selectByVisibleText(text);
        }
    }






