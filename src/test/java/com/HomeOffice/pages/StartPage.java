package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StartPage extends UIInteractionSteps {

    static By START_NOW = By.cssSelector("a.gem-c-button.govuk-button.govuk-button--start");

    @Step("Click the Start Now button")
    public void click_start_now_button() {
        $(START_NOW).click();
    }
}
