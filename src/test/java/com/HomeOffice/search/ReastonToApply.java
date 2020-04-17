package com.HomeOffice.search;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


public class ReastonToApply extends UIInteractionSteps {

    static By REASON_TOURISM = By.xpath("//label[text()='Tourism']");
    static By REASON_STUDY = By.xpath("//label[text()='Study']");

    @Step("Select the reason for visa")
    public void select_reason(String reason){
        if (reason.equals("Study"))
            $(REASON_STUDY).click();
        else if(reason.equals("Tourism"))
            $(REASON_TOURISM).click();
    }
}
