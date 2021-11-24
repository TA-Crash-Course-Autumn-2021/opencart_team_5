package com.opencart.steps;

import com.opencart.pages.MainPage;
import com.opencart.pages.containers.ProductContainer;
import org.testng.Assert;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public MainPageBL addProductToCart(String productName) {
        ProductContainer product = mainPage.getProducts().stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst().orElseThrow(NullPointerException::new);
        product.getAddToCartButton().click();
        return this;
    }

    public void verifySuccessAddToCart(String productName) {
        Assert.assertTrue(mainPage.getAlert().getAttribute("class").contains("success"));
        Assert.assertTrue(mainPage.getAlert().getText().contains(productName), "Other item was added to cart");
    }
}
