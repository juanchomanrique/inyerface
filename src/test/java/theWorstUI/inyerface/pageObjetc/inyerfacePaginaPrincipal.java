package theWorstUI.inyerface.pageObjetc;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class inyerfacePaginaPrincipal extends PageObject {

    @FindBy(className = ".start__link")
    WebElementFacade next;


    public void startGame() {
        next.click();
    }
}
