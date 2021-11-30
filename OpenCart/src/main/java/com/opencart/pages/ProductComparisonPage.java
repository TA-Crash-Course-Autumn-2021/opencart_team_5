package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductComparisonPage extends BasePage{

    @FindBy(xpath = "//strong[normalize-space()='MacBook']")
    private WebElement macbookProductComparison;

    public WebElement getMacbookProductComparison() {
        wait.until(ExpectedConditions.visibilityOf(macbookProductComparison));
        return macbookProductComparison;
    }
}
