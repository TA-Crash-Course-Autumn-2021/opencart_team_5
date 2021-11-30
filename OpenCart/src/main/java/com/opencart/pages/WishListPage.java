package com.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WishListPage extends BasePage {

    public WebElement getTitleOfProduct(String productName) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='content']/div[@class='table-responsive']/table/tbody//a[text()='"+productName+"']"))));
    }
}
