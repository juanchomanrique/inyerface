package theWorstUI.inyerface.pageObjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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


    public static final String TITULO_RESULTADO_ESPERADO = "//h3[contains(@class,'LC20lb DKV0Md') and contains(.,'{0}')]";


    public void typePasswordAndMail(String passw,String email) {
        password.clear();
        password.sendKeys(passw);
        mail.clear();
        mail.sendKeys(email);
        domain.clear();
        domain.sendKeys("none");

        Select selectByValue = new Select(driver.findElement(By.className(".dropdown__field")));
        selectByValue.selectByVisibleText(".com");
    }

    public void clickOnCheckbox() {
        checkTerms.click();
    }

    public void clickOnNext(String textNext) {
        driver.findElement(By.xpath("//a[contains(@class,'button--secondary') and contains(text(),'{0}')]")).click();
    }
}
