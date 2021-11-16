package com.opencart.steps;

import com.opencart.pages.ShoppingCartPage;
import org.testng.Assert;

public class ShoppingCartPageBL {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartPageBL() {
        shoppingCartPage = new ShoppingCartPage();
    }

    public void verifyMacBookInCard() {
        Assert.assertTrue(shoppingCartPage.getMacBookInCart().getText().equals("MacBook"), "The product isn't in cart");
    }

    public void verifyAppleCinemaInCart() {
        Assert.assertTrue(shoppingCartPage.getAppleCinemaInCart().getText().contains("Apple Cinema"), "The product isn't in cart");
    }

    public void verifyCanonEos5DInCart() {
        Assert.assertTrue(shoppingCartPage.getCanonEos5DInCart().getText().equals("Canon EOS 5D"), "The product isn't in cart");
    }

    public void verifyIPhoneInCart() {
        Assert.assertTrue(shoppingCartPage.getIPhoneInCart().getText().equals("iPhone"), "The product isn't in cart");
    }

    public ShoppingCartPageBL clickOnShoppingCartButton() {
        shoppingCartPage.getShoppingCartButton().click();
        return new ShoppingCartPageBL();
    }
}
