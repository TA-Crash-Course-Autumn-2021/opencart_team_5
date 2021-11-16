package com.opencart.steps;

import com.opencart.datamodel.AppleCinemaModel;
import com.opencart.datamodel.CanonEOS5DModel;
import com.opencart.pages.CanonEOS5DPage;
import com.opencart.repository.AppleCinemaModelRepository;
import com.opencart.repository.CanonEOS5DModelRepository;
import org.testng.Assert;

public class CanonEOS5DPageBL {

    private CanonEOS5DPage canonEOS5DPage;

    public CanonEOS5DPageBL() {
        canonEOS5DPage = new CanonEOS5DPage();
    }

    public CanonEOS5DPageBL chooseOptionsCanonEOS5D() {
        CanonEOS5DModel  canonEOS5DModel = CanonEOS5DModelRepository.getCanonEOS5DModel();
        selectColour(canonEOS5DModel.getSelect());
        inputQuantity(canonEOS5DModel.getQty());
        clickOnAddToCartButton();
        return this;
    }

    private void selectColour(int value) {
        canonEOS5DPage.getSelectColourButton().click();
        canonEOS5DPage.chooseSelectOption(value).click();
    }

    private void inputQuantity(String qty) {
        canonEOS5DPage.getInputQuantityFieldButton().click();
        canonEOS5DPage.getInputQuantityFieldButton().clear();
        canonEOS5DPage.getInputQuantityFieldButton().sendKeys(qty);
    }

    public CanonEOS5DPageBL clickOnAddToCartButton() {
        canonEOS5DPage.getAddToCartButton().click();
        return this;
    }

    public void verifySuccessAddToCartAppleCinema(String productName) {
        Assert.assertTrue(canonEOS5DPage.getAlert().getAttribute("class").contains("success"), "Product wasn't added to cart");
        Assert.assertTrue(canonEOS5DPage.getAlert().getText().contains(productName), "Other item was added to cart");
    }
}
