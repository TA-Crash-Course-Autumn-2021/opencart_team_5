package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = ".//*[@id='input-email']")
    private WebElement emailInputField;

    @FindBy(xpath = ".//*[@id='input-password']")
    private WebElement passwordInputField;

    @FindBy(xpath = ".//*[@value='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@title = 'Your Store']")
    private WebElement opencartImage;

    public WebElement getEmailInputField() {
        return emailInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getOpencartImageButton() {
        wait.until(ExpectedConditions.visibilityOf(opencartImage));
        return opencartImage;
    }
}
