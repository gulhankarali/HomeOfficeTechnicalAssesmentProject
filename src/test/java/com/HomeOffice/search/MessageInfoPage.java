package com.HomeOffice.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class MessageInfoPage extends UIInteractionSteps {

    static By MESSAGE= By.xpath("//*[contains(text(), 'the UK')]");

    public String get_message(){
        return $(MESSAGE).getText();
    }
}
