package com.HomeOffice.stepdefinitions;

import com.HomeOffice.navigation.Navigate;
import com.HomeOffice.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VerifyVisaSituationStepDefinitions extends UIInteractionSteps {

    @Steps
    Navigate navigate;

    @Steps
    StartPage startPage;

    @Steps
    CheckNationalityPage checkNationalityPage;

    @Steps
    ReastonToApplyPage reastonToApplyPage;

    @Steps
    LengthOfDurationPage lengthOfDurationPage;

    @Steps
    DetailedReasonPage detailedReasonPage;

    @Steps
    SubmitFormPage submitFormPage;

    @Steps
    MessageInfoPage messageInfoPage;

    @Given("I am on the visa check page")
    public void i_am_on_the_visa_check_page() {
        navigate.HomeOfficeCheckUKVisaFirstPage();
    }

    @When("I clicked the start now button")
    public void i_clicked_the_start_now_button() {
        startPage.click_start_now_button();
    }

    @Then("I am on the country list page")
    public void i_am_on_the_country_list_page() {
        String actualPageURL = navigate.getDriver().getCurrentUrl();
        String expectedPageURL= "https://www.gov.uk/check-uk-visa/y";
        Assert.assertEquals(expectedPageURL,actualPageURL);
    }

    @Given("I provide a nationality of {string}")
    public void i_provide_a_nationality_of(String nationality) {
        checkNationalityPage.select_nationality_as(nationality);
    }

    @Given("I select the {string}")
    public void i_select_the(String reason) {
        reastonToApplyPage.select_reason(reason);
    }

    @Given("I state I am intending to stay for {string}")
    public void i_state_I_am_intending_to_stay_for(String length) {
        lengthOfDurationPage.length_of_stay(length);
    }
    @Given("I state {string}")
    public void i_state(String statement) {
        detailedReasonPage.select_reason(statement);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        String expectedPageName= "Check if you need a UK visa";
        String actualPageName= submitFormPage.submit_form();
        Assert.assertEquals(expectedPageName,actualPageName);
    }

    @Then("I will be informed {string}")
    public void i_will_be_informed(String expectedMessage) {
        String actualMessage= messageInfoPage.get_message();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
