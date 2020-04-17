package com.HomeOffice.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


public class CheckNationality extends UIInteractionSteps {

    static By NEXT_STEP= By.xpath("//*[text()='Next step']");
    @FindBy(id="response")
    WebElementFacade countryDropDown;

    @Step("Select the nationality")
    public void select_nationality_as_Japan() {
        countryDropDown.selectByVisibleText("Japan");
    }
}
