package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class LengthOfDuration extends UIInteractionSteps {
    static By DURATION_6MONTHS= By.cssSelector("input#response-0.govuk-radios__input");
    static By DURATION_LONGERTHAN6MONTH= By.cssSelector("input#response-1.govuk-radios__input");

    public void length_of_stay(int length){
        if (length<=6)
            $(DURATION_6MONTHS).click();
        else if (length>6)
            $(DURATION_LONGERTHAN6MONTH).click();
    }
}
