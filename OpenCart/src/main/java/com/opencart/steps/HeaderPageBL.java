package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import org.openqa.selenium.Keys;
import org.testng.reporters.jq.Main;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public HeaderPageBL clickOnSearchField() {
        headerPage.getSearchField().click();
        headerPage.getSearchField().clear();
        return this;
    }

    public HeaderPageBL sendNameToSearchField(String keyWords) {
        headerPage.getSearchField().sendKeys(keyWords);
        return this;
    }

    public MainPageBL sendEnterToSearchProduct() {
        headerPage.getSearchField().sendKeys(Keys.ENTER);
        return new MainPageBL();
    }

    public MainPageBL clickOnSearchButton() {
        headerPage.getSearchButton().click();
        return new MainPageBL();
    }

    public ShoppingCartPageBL clickOnShoppingCartButton() {
        headerPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }
}
