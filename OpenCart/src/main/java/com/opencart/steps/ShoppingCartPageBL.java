package com.opencart.steps;

import com.opencart.pages.ShoppingCartPage;
import org.testng.Assert;

public class ShoppingCartPageBL {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageBL() {
        shoppingCartPage = new ShoppingCartPage();
    }

    public void verifyProductInCart(String product) {
        Assert.assertTrue(shoppingCartPage.getProductInCart(product).getText().contains(product), "Product wasn't added to wish list");
    }

    public ShoppingCartPageBL clickOnShoppingCartButton() {
        shoppingCartPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }
}
