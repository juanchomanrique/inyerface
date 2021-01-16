package theWorstUI.inyerface.pageObjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class inyerfaceSecondSection extends PageObject {

    public static final String TEXT = "//h2[contains(@class,'avatar')]";
    public static final String UPLOAD = "//a[contains(text(),'{0}')]";
    public static final String NUM = "div.avatar-and-interests__interests-list__item:nth-child({0}) div:nth-child(1) > span.checkbox.small:nth-child(1)";


    @FindBy(css = "div.avatar-and-interests__interests-list__item:last-child div:nth-child(1) > span.checkbox.small:nth-child(1)")
    WebElementFacade unselect;

    @FindBy(xpath= "//button[contains(text(),'Next')]")
    WebElementFacade next;

    @FindBy(css="li.avatar-and-interests__error:nth-child(1)")
    WebElementFacade WARN1;

    @FindBy(css="li.avatar-and-interests__error:nth-child(2)")
    WebElementFacade WARN2;

    public void checkTheText(String expectext) {
        String theText=findBy(TEXT).getText();
        Assert.assertEquals(theText, expectext );
    }


    public void uploadImage(String upText) {
        findBy(UPLOAD,upText).then().click();
    }

    public void selectInterests(int numInterest) {
        unselect.click();
        for (int i = 0; i < numInterest; i++) {
            findBy(NUM,i+1).then().click();
        }
    }

    public void clicOnNext() {
        next.click();
    }

    public void checkWarnings(String warning1, String warning2) {
        String firstWarn=WARN1.getText();
        Assert.assertEquals(firstWarn, warning1 );
        String secondWarn=WARN2.getText();
        Assert.assertEquals(secondWarn, warning2 );
    }
}
