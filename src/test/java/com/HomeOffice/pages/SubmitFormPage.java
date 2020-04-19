package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SubmitFormPage extends UIInteractionSteps {

    static By PAGE_NAME= By.cssSelector("h1.gem-c-title__text");

    @Step("Submit the form")
    public String submit_form(){
        return $(PAGE_NAME).getText();
    }
}
