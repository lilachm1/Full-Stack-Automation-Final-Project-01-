package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import workFlows.WebFlows;

import java.util.List;

import static org.jsoup.helper.Validate.fail;
import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Text In Element")
    public static void VerificationTextInElement(WebElement elem, String expected)
    {
       assertEquals(elem.getText(), expected);
    }

    @Step("Verify Visibility Of Elements")
public static void VisebilityOfElements(WebElement elem)
{ assertTrue(elem.isDisplayed());}


    @Step("Verify Elements are Not Visible")
    public static void ElementsAreNotVisibile(WebElement elem)
    { assertFalse(elem.isDisplayed());}


    @Step("Verify Visibility Of ListElements (soft assertion)")
    public static void VisebilityOfListElements(List<WebElement> elems)
    {
                for ( WebElement elem : elems)
        {
            softAssert.assertTrue(elem.isDisplayed());
        }
        softAssert.assertAll();
    }

    @Step("Verify That Elements are Enabled")
    public static void EnabledOfElements(WebElement elem)
    { assertTrue(elem.isEnabled());}

    @Step("Verifay Element Visually")
    public static  void  VisualElement(String ExceptedImageName)
    {
        try {
            screen.find(getData("ImageRepo") + ExceptedImageName + ".png" );
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File" + findFailed);
            fail("Error Comparing Image File" + findFailed);
        }
    }


    @Step("Verify Text with Text")
    public static void verifayText( String actual, String expected){
        assertEquals(actual, expected);
    }
}




