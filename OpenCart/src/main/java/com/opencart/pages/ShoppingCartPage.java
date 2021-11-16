package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@id = 'top-links']//a[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = 'MacBook']")
    private WebElement macBookInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = 'Apple Cinema 30\"']")
    private WebElement appleCinemaInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = 'Canon EOS 5D']")
    private WebElement canonEos5DInCart;

    @FindBy(xpath = "//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = 'iPhone']")
    private WebElement iPhoneInCart;

    public WebElement getShoppingCartButton() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        return shoppingCartButton;
    }

    public WebElement getMacBookInCart() {
        wait.until(ExpectedConditions.visibilityOf(macBookInCart));
        return macBookInCart;
    }

    public WebElement getAppleCinemaInCart() {
        wait.until(ExpectedConditions.visibilityOf(appleCinemaInCart));
        return appleCinemaInCart;
    }

    public WebElement getCanonEos5DInCart() {
        wait.until(ExpectedConditions.visibilityOf(canonEos5DInCart));
        return canonEos5DInCart;
    }

    public WebElement getIPhoneInCart() {
        wait.until(ExpectedConditions.visibilityOf(iPhoneInCart));
        return iPhoneInCart;
    }
}
