package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
import com.opencart.repository.LoginModelRepository;

public class LoginPageBL {

    private LoginPage loginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    private LoginPageBL inputEmail(String email) {
        loginPage.getEmailInputField().clear();
        loginPage.getEmailInputField().sendKeys(email);
        return this;
    }

    private LoginPageBL inputPassword(String password) {
        loginPage.getPasswordInputField().clear();
        loginPage.getPasswordInputField().sendKeys(password);
        return this;
    }

    private LoginPageBL clickOnLoginButton() {
        loginPage.getLoginButton().click();
        return this;
    }

    public void clickOnOpenCartImageButton() {
        loginPage.getOpencartImageButton().click();
    }
}
