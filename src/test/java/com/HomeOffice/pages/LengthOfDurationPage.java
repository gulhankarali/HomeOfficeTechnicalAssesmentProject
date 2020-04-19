package com.HomeOffice.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class    LengthOfDurationPage extends UIInteractionSteps {
    static By DURATION_LESSTHAN6MONTHS= By.cssSelector("input#response-0.govuk-radios__input");
    static By DURATION_LONGERTHAN6MONTHS= By.cssSelector("input#response-1.govuk-radios__input");
    static By NEXT_STEP= By.xpath("//*[text()='Next step']");

    public void length_of_stay(String length){
        if (length.equals("6 months or less"))
            $(DURATION_LESSTHAN6MONTHS).click();
        else if (length.equals("longer than 6 months"))
            $(DURATION_LONGERTHAN6MONTHS).click();
        $(NEXT_STEP).click();
    }
}
