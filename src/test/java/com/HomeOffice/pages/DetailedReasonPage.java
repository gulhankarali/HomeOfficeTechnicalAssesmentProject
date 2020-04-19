package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DetailedReasonPage extends UIInteractionSteps {

    static By ANSWER_YES = By.cssSelector("input#response-0.govuk-radios__input");
    static By ANSWER_NO = By.cssSelector("input#response-1.govuk-radios__input");

    static By NEXT_STEP = By.xpath("//*[text()='Next step']");

    @Step("Select the reason for visa")
    public void select_reason(String yes_or_no) {
        if (yes_or_no.equals("YES"))
            $(ANSWER_YES).click();
        else if (yes_or_no.equals("NO"))
            $(ANSWER_NO).click();
        $(NEXT_STEP).click();
    }
}