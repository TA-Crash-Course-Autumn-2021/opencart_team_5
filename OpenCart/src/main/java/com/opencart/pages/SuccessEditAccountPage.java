package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessEditAccountPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;


    public WebElement getAlert() {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }
}
