package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppleCinema30Page extends BasePage{

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Text']/../input")
    private WebElement inputTextFieldButton;

    @FindBy(xpath = "//select[contains(@id, 'input-option')]")
    private WebElement selectColourButton;

    @FindBy(xpath = "//textarea[contains(@id, 'input-option')]")
    private WebElement inputTextareaButton;

    @FindBy(xpath = "//button[starts-with(@id,'button-upload')]")
    private WebElement uploadFileButton;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD']")
    private WebElement chooseDateButton;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='HH:mm']")
    private WebElement chooseTimeButton;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD HH:mm']")
    private WebElement chooseDateAndTimeButton;

    @FindBy(id = "input-quantity")
    private WebElement inputQuantityFieldButton;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[contains(@class,'alert-')]")
    private WebElement alert;

    @FindBy(xpath = "//*[@title = 'Your Store']")
    private WebElement opencartImage;

    public WebElement getInputTextFieldButton() {
        wait.until(ExpectedConditions.visibilityOf(inputTextFieldButton));
        return inputTextFieldButton;
    }

    public WebElement getSelectColourButton() {
        wait.until(ExpectedConditions.visibilityOf(selectColourButton));
        return selectColourButton;
    }

    public WebElement getInputTextareaButton() {
        wait.until(ExpectedConditions.visibilityOf(inputTextareaButton));
        return inputTextareaButton;
    }

    public WebElement getUploadFileButton() {
        wait.until(ExpectedConditions.visibilityOf(uploadFileButton));
        return uploadFileButton;
    }

    public WebElement getChooseDateButton() {
        wait.until(ExpectedConditions.visibilityOf(chooseDateButton));
        return chooseDateButton;
    }

    public WebElement getChooseTimeButton() {
        wait.until(ExpectedConditions.visibilityOf(chooseTimeButton));
        return chooseTimeButton;
    }

    public WebElement getChooseDateAndTimeButton() {
        wait.until(ExpectedConditions.visibilityOf(chooseDateAndTimeButton));
        return chooseDateAndTimeButton;
    }

    public WebElement getInputQuantityFieldButton() {
        wait.until(ExpectedConditions.visibilityOf(inputQuantityFieldButton));
        return inputQuantityFieldButton;
    }

    public WebElement getAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton;
    }

    public WebElement getSizeRadioButton(int value) {  // 5/6/7
        return driver.findElement(By.xpath("//label//input[@type = 'radio' and @value = '" + value + "']"));
    }

    public WebElement getCheckboxButton(int value) {     // 8/9/10/11
        return driver.findElement(By.xpath("//label//input[@type = 'checkbox' and @value = '" + value + "']"));
    }

    public WebElement chooseSelectOption(int value) {   // 1/2/3/4
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]//option[@value = '" + value + "']"));
    }

    public WebElement getAlert() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert;
    }

    public WebElement getOpencartImageButton() {
        wait.until(ExpectedConditions.visibilityOf(opencartImage));
        return opencartImage;
    }
}
