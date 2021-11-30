package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@id = 'top-links']//a[@title='Shopping Cart']")
    private WebElement shoppingCartButton;

    public WebElement getShoppingCartButton() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        return shoppingCartButton;
    }

    public WebElement getProductInCart(String productName) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = '"+productName+"']"))));
    }
}
