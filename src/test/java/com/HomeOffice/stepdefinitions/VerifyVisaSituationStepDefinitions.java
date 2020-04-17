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
    CheckNationality checkNationality;

    @Steps
    ReastonToApply reastonToApply;

    @Steps
    LengthOfDuration lengthOfDuration;

    @Steps
    SubmitForm submitForm;

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
        Assert.assertEquals("https://www.gov.uk/check-uk-visa/y",actualPageURL);
    }

    @Given("I provide a nationality of Japan")
    public void i_provide_a_nationality_of_Japan() {
        checkNationality.select_nationality_as_Japan();
        submitForm.submit_form();
    }

    @Given("I select the {string}")
    public void i_select_the(String reason) {
        reastonToApply.select_reason(reason);
        submitForm.submit_form();
    }

    @Given("I state I am intending to stay for more than {int} months")
    public void i_state_I_am_intending_to_stay_for_more_than_months(int months) throws InterruptedException {
        lengthOfDuration.length_of_stay(months+1);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        submitForm.submit_form();
    }

    @Then("I will be informed {string}")
    public void i_will_be_informed(String expectedMessage) {
        String actualMessage= messageInfoPage.get_message();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Given("I provide a nationality of Russia")
    public void i_provide_a_nationality_of_Russia() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I state I am not travelling or visiting a partner or family")
    public void i_state_I_am_not_travelling_or_visiting_a_partner_or_family() {
        // Write code here that turns the phrase above into concrete actions

    }


}
