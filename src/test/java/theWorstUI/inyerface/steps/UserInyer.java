package theWorstUI.inyerface.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import theWorstUI.inyerface.pageObjetc.inyerfacePaginaPrincipal;
import theWorstUI.inyerface.pageObjetc.inyerfaceFirstSection;
import theWorstUI.inyerface.pageObjetc.inyerfaceSecondSection;
import net.thucydides.core.annotations.Steps;

public class UserInyer {

    @Steps
    inyerfacePaginaPrincipal mainPage;
    @Steps
    inyerfaceFirstSection firstSection;
    @Steps
    inyerfaceSecondSection secondSection;

    @Given("Juan is on the UserInyerface homepage")
    public void go_to_UserInyerface() {
        mainPage.setDefaultBaseUrl("https://userinyerface.com/");
        mainPage.open();
    }

    @When("Juan starts the game by clicking over \"HERE\" text")
    public void starts_the_game() {
        mainPage.startGame();
    }

    @And("fill the password \"(.*)\" and email \"(.*)\" in the first game section")
    public void fill_password_and_mail(String password, String email){
        firstSection.typePasswordAndMail(password,email);
    }
    @And("accepts the Terms and Conditions")
    public void click_checkbox_terms(){
        firstSection.clickOnCheckbox();
    }

    @And("click on \"(.*)\" text")
    public void click_next(String textToClick){
        firstSection.clickOnNext(textToClick);
    }

    @Then("Juan will see the section 2 \"This is me\" in less than (.*) minute")
    //Validate if the timer is under specified minutes
    public void check_time(String expectedTime) {
        secondSection.checkTime(expectedTime);
        System.out.println(expectedTime);
    }
}
