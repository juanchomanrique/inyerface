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

    @Given("User is on the UserInyerface homepage")
    public void go_to_UserInyerface() {
        mainPage.setDefaultBaseUrl("https://userinyerface.com/");
        mainPage.open();
    }

    @When("User starts the game by clicking over \"HERE\" text")
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

    @Then("User sees the text \"(.*)\" on the screen")
    //Validate if the expected Text is displayed on the page
    public void check_text(String expectedText) {
        secondSection.checkTheText(expectedText);
    }


    @Given("User reach the section \"(.*)\" using password \"(.*)\" and email \"(.*)\" and clicking on (.*)")
    public void userIsInTheSection(String section, String password, String email, String textToClick) {
        mainPage.setDefaultBaseUrl("https://userinyerface.com/");
        mainPage.open();

        mainPage.startGame();

        firstSection.typePasswordAndMail(password,email);

        firstSection.clickOnCheckbox();

        firstSection.clickOnNext(textToClick);

        secondSection.checkTheText(section);
    }

    @And("select (.*) interests")
    public void selectInterests(int numInterest) {
        secondSection.selectInterests(numInterest);
    }

    @When("User clicks on the Next button")
    public void userClicksOnTheNextButton() {
        secondSection.clicOnNext();
    }

    @Then("User sees the warning messages \"(.*)\" and \"(.*)\"")
    public void userSeesTheMessagesAnd(String warning1, String warning2) {
        secondSection.checkWarnings(warning1, warning2);

    }


}
