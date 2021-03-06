package com.opencart.pages;

import com.opencart.pages.containers.ProductContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;

    @FindBy(xpath = "//a[normalize-space()='product comparison']")
    private WebElement comparisonAlert;


    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }

    public WebElement getAlert() {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }

    public WebElement getComparisonAlert() {
        wait.until(ExpectedConditions.visibilityOf(comparisonAlert));
        return comparisonAlert;
    }

    public WebElement getAlertWishList() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }
}
