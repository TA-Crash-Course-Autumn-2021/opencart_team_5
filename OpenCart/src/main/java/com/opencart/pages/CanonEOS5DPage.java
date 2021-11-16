package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CanonEOS5DPage extends BasePage {

    @FindBy(xpath = "//*[@id='input-option226']")
    private WebElement chooseColourField;

    @FindBy(id = "input-quantity")
    private WebElement inputQuantityFieldButton;

    @FindBy(xpath = "//*[@id='button-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;

    public WebElement getSelectColourButton() {
        wait.until(ExpectedConditions.visibilityOf(chooseColourField));
        return chooseColourField;
    }

    public WebElement chooseSelectOption(int value) {   // 15/16
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]//option[@value = '" + value + "']"));
    }

    public WebElement getInputQuantityFieldButton() {
        wait.until(ExpectedConditions.visibilityOf(inputQuantityFieldButton));
        return inputQuantityFieldButton;
    }

    public WebElement getAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton;
    }

    public WebElement getAlert() {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }
}
