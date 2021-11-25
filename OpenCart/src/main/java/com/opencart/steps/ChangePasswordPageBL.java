package com.opencart.steps;

import com.opencart.pages.ChangePasswordPage;
import com.opencart.pages.SuccessEditAccountPage;
import com.opencart.pages.SuccessRegisterPage;
import org.testng.Assert;

public class ChangePasswordPageBL {

    private ChangePasswordPage changePasswordPage;
    private SuccessEditAccountPage successEditAccountPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL inputCurrentPassword(String password) {
        changePasswordPage.getCurrentPasswordField().clear();
        changePasswordPage.getCurrentPasswordField().sendKeys(password);
        return this;
    }

    public ChangePasswordPageBL inputNewPassword(String password) {
        changePasswordPage.getNewPasswordField().clear();
        changePasswordPage.getNewPasswordField().sendKeys(password);
        return this;
    }

    public ChangePasswordPageBL clickOnContinueButton() {
        changePasswordPage.getContinueButton().click();
        return this;
    }

    public void verifyNotMatchingPassword() {
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(changePasswordPage.getNotMatchPasswordAlert().getText(), expectedMessage, "Your Password confirmation does not match password!");
        Assert.assertTrue(changePasswordPage.getNotMatchPasswordAlert().getAttribute("class").contains("danger"), "Your Password confirmation does not match password!");
    }
}
