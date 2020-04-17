package com.HomeOffice.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Navigate extends PageObject {

    HomeOfficeCheckUKVisaFirstPage homeOfficeCheckUKVisaPage;

    @Step("Open HomeOffice CheckUKVisa First Page")
    public void HomeOfficeCheckUKVisaFirstPage() {
        homeOfficeCheckUKVisaPage.open();
    }
}
