package com.opencart.steps;

import com.opencart.datamodel.EditAccountModel;
import com.opencart.datamodel.RegisterModel;
import com.opencart.pages.MyAccountInfoPage;
import com.opencart.pages.SuccessRegisterPage;
import com.opencart.repository.EditAccountModelRepository;
import com.opencart.repository.RegisterModelRepository;

public class MyAccountInfoPageBL {

    private MyAccountInfoPage myAccountInfoPage;

    public MyAccountInfoPageBL() {
        myAccountInfoPage = new MyAccountInfoPage();
    }

    public MyAccountInfoPageBL editAllInfoAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        return this;
    }

    public MyAccountInfoPageBL editFirstNameAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        return this;
    }

    public MyAccountInfoPageBL editLastNameAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputLastName(editAccountModel.getLastName());
        return this;
    }

    public MyAccountInfoPageBL editEmailOfPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputEmail(editAccountModel.getEmail());
        return this;
    }

    public MyAccountInfoPageBL editTelephoneOfPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputTelephone(editAccountModel.getTelephone());
        return this;
    }

    private void inputFirstName(String firstName) {
        myAccountInfoPage.getFirstNameField().clear();
        myAccountInfoPage.getFirstNameField().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        myAccountInfoPage.getLastNameField().clear();
        myAccountInfoPage.getLastNameField().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        myAccountInfoPage.getEmailField().clear();
        myAccountInfoPage.getEmailField().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        myAccountInfoPage.getTelephoneField().clear();
        myAccountInfoPage.getTelephoneField().sendKeys(telephone);
    }

    public MyAccountInfoPageBL clickOnContinueButton() {
        myAccountInfoPage.getContinueButton().click();
        return this;
    }

}
