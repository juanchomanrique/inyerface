package theWorstUI.inyerface.pageObjetc;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inyerfaceSecondSection extends PageObject {

    WebDriver driver = getDriver();

    public void checkTime(String timer) {
        String theTime = driver.findElement(By.className("timer")).getText();
    }
}
