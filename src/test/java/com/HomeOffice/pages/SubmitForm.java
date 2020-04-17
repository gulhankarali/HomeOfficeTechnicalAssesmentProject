package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SubmitForm extends UIInteractionSteps {
    static By NEXT_STEP= By.xpath("//*[text()='Next step']");

    @Step("Submit the form")
    public void submit_form(){
        $(NEXT_STEP).click();
    }

}
