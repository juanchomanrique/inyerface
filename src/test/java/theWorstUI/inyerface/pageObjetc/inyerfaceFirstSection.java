package theWorstUI.inyerface.pageObjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class inyerfaceFirstSection extends PageObject {
    WebDriver driver = getDriver();
    @FindBy(css = "div:nth-child(2) > input")
    WebElementFacade password;

    @FindBy(css = "input[placeholder~=\"email\"]")
    WebElementFacade mail;

    @FindBy(css = "input[placeholder~=\"Domain\"]")
    WebElementFacade domain;

    @FindBy(css ="span[class~=\"checkbox\"]")
    WebElementFacade checkTerms;

    @FindBy(css=".dropdown__opener")
    WebElementFacade drop;

    @FindBy(xpath= "//div[contains(@class,'dropdown__list-item') and contains(text(),'.com')]")
    WebElementFacade list;

    public static final String NEXT_TEXT = "//a[contains(@class,'button--secondary') and contains(text(),'{0}')]";

    public void typePasswordAndMail(String passw,String email) {
        password.clear();
        password.sendKeys(passw);
        mail.clear();
        mail.sendKeys(email);
        domain.clear();
        domain.sendKeys("none");
        drop.click();

        list.click();
    }

    public void clickOnCheckbox() {
        checkTerms.click();
    }

    public void clickOnNext(String textNext) {
        findBy(NEXT_TEXT,textNext).then().click();
    }
}
