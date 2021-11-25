package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInfoPage extends BasePage{

    @FindBy(xpath = "//a[text()='Password']")
    private WebElement passwordButton;

    @FindBy(xpath = "//a[text()='Edit Account']")
    private WebElement editAccountButton;

    public WebElement getPasswordButton() {
        return passwordButton;
    }

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }
}
