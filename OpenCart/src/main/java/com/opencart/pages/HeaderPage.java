package com.opencart.pages;

import com.opencart.steps.HeaderPageBL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@name = 'search']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='fa fa-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id = 'top-links']//a[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = ".//a[text() = 'Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id = 'top-links']//i[contains(@class,'heart')]")
    private WebElement wishListButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getShoppingCartButton() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        return shoppingCartButton;
    }

    public WebElement getWishListButton() {
        wait.until(ExpectedConditions.visibilityOf(wishListButton));
        return wishListButton;
    }
}
