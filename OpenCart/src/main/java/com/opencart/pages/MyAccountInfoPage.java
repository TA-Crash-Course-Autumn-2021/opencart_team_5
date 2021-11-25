package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountInfoPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@name='telephone']")
    private WebElement telephoneField;

    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueButton;

    public WebElement getFirstNameField() {
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getTelephoneField() {
        return telephoneField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
