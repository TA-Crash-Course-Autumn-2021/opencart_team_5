package com.opencart.steps;

import com.opencart.pages.MainPage;
import com.opencart.pages.containers.ProductContainer;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

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

    public MainPageBL addProductToWishList(String productName) {
        ProductContainer product = mainPage.getProducts().stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst().orElseThrow(NullPointerException::new);
        product.getAddToWishListButton().click();
        return this;
    }

    //mine
    public MainPageBL clickOnCompareToButton(String productName) {
        ProductContainer product = mainPage.getProducts().stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst().orElseThrow(NullPointerException::new);
        product.getCompareThisProductButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public boolean searchProductOnPage(String productName) {
        ProductContainer product = mainPage.getProducts().stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst().orElseThrow(NullPointerException::new);
        return true;
    }

    //mine
    public String verifySuccessProductComparison() {
       return mainPage.getAlert().getText();
    }

    //mine
    public ProductComparisonPageBL clickOnComparisonAlertLink(){
        mainPage.getComparisonAlert().click();
        return new ProductComparisonPageBL();
    }

    //mine
    public void scrollDown() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_END);
            robot.keyRelease(KeyEvent.VK_END);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
        catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void verifySuccessAddToCart(String productName) {
        Assert.assertTrue(mainPage.getAlert().getAttribute("class").contains("success"));
        Assert.assertTrue(mainPage.getAlert().getText().contains(productName), "Other item was added to cart");
    }

    public void verifySuccessAddToWishListAlert(String productName) {
        Assert.assertTrue(mainPage.getAlertWishList().getAttribute("class").contains("success"));
        Assert.assertTrue(mainPage.getAlertWishList().getText().contains(productName), "Other item was added to wish list");
    }

    public void verifySuccessSearching(String productName) {
        Assert.assertTrue(searchProductOnPage(productName));
    }
}
