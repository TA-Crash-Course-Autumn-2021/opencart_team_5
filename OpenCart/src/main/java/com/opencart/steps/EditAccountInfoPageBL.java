package com.opencart.steps;

import com.opencart.pages.EditAccountInfoPage;

public class EditAccountInfoPageBL {

    private EditAccountInfoPage editAccountInfoPage;

    public EditAccountInfoPageBL() {
        editAccountInfoPage = new EditAccountInfoPage();
    }

    public EditAccountInfoPageBL clickOnPasswordButton() {
        editAccountInfoPage.getPasswordButton().click();
        return this;
    }

    public EditAccountInfoPageBL clickOnEditAccountButton() {
        editAccountInfoPage.getEditAccountButton().click();
        return this;
    }
}
