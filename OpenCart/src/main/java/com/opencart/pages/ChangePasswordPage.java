package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ChangePasswordPage extends BasePage{

    @FindBy(xpath = "//*[@name='password']")
    private WebElement currentPasswordField;

    @FindBy(xpath = "//*[@name='confirm']")
    private WebElement newPasswordField;

    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement notMatchPasswordAlert;

    public WebElement getCurrentPasswordField() {
        return currentPasswordField;
    }

    public WebElement getNewPasswordField() {
        return newPasswordField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getNotMatchPasswordAlert() {
        wait.until(ExpectedConditions.visibilityOf(notMatchPasswordAlert));
        return notMatchPasswordAlert;
    }


}
