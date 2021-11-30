package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductComparisonPage extends BasePage{

    @FindBy(xpath = "//strong[normalize-space()='MacBook']")
    private WebElement macbookProductComparison;

    @FindBy(xpath = "//strong[normalize-space()='iPhone']")
    private WebElement iphoneProductComparison;

    @FindBy(xpath = "//strong[normalize-space()='Apple Cinema 30\"']")
    private WebElement cinemaProductComparison;

    @FindBy(xpath = "//strong[normalize-space()='Canon EOS 5D']")
    private WebElement canonProductComparison;



    public WebElement getMacbookProductComparison() {
        wait.until(ExpectedConditions.visibilityOf(macbookProductComparison));
        return macbookProductComparison;
    }

    public WebElement getIphoneProductComparison() {
        wait.until(ExpectedConditions.visibilityOf(iphoneProductComparison));
        return iphoneProductComparison;
    }

    public WebElement getCinemaProductComparison() {
        wait.until(ExpectedConditions.visibilityOf(cinemaProductComparison));
        return cinemaProductComparison;
    }

    public WebElement getCanonProductComparison() {
        wait.until(ExpectedConditions.visibilityOf(canonProductComparison));
        return canonProductComparison;
    }
}
