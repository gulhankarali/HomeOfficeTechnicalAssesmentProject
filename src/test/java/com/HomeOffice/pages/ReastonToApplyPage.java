package com.HomeOffice.pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.serenitybdd.core.steps.UIInteractionSteps;


public class ReastonToApplyPage extends UIInteractionSteps {

    static By REASON_TOURISM = By.cssSelector("input#response-0.govuk-radios__input");
    static By REASON_STUDY = By.cssSelector("input#response-2.govuk-radios__input");
    static By NEXT_STEP= By.xpath("//*[text()='Next step']");

    @Step("Select the reason for visa")
    public void select_reason(String reason){
        if (reason.equals("Study"))
            $(REASON_STUDY).click();
        else if(reason.equals("Tourism"))
            $(REASON_TOURISM).click();
        $(NEXT_STEP).click();
    }
}
