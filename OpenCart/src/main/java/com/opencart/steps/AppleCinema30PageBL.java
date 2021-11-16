package com.opencart.steps;

import com.opencart.datamodel.AppleCinemaModel;
import com.opencart.pages.AppleCinema30Page;
import com.opencart.repository.AppleCinemaModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class AppleCinema30PageBL {

    private AppleCinema30Page appleCinema30Page;

    public AppleCinema30PageBL() {
        appleCinema30Page = new AppleCinema30Page();
    }

    public AppleCinema30PageBL chooseOptionsAppleCinema() {
        AppleCinemaModel appleCinemaModel = AppleCinemaModelRepository.getAppleCinemaModel();
        inputText(appleCinemaModel.getText());
        inputSize(appleCinemaModel.getRadio());
        inputCheckbox(appleCinemaModel.getCheckbox());
        selectColour(appleCinemaModel.getSelect());
        inputTextarea(appleCinemaModel.getTextarea());
        inputDate(appleCinemaModel.getDate());
        inputTime(appleCinemaModel.getTime());
        inputDateAndTime(appleCinemaModel.getDateAndTime());
        inputQuantity(appleCinemaModel.getQty());
        uploadFileByButton(appleCinemaModel.getFile());
        clickOnAddToCartButton();
        return this;
    }

    private void inputText(String text) {
        appleCinema30Page.getInputTextFieldButton().click();
        appleCinema30Page.getInputTextFieldButton().clear();
        appleCinema30Page.getInputTextFieldButton().sendKeys(text);
    }

    private void inputSize(int value) {
        new DriverUtils().clickOnElementJS(appleCinema30Page.getSizeRadioButton(value));
    }

    private void inputCheckbox(int value) {
        new DriverUtils().clickOnElementJS(appleCinema30Page.getCheckboxButton(value));
    }

    private void selectColour(int value) {
        appleCinema30Page.getSelectColourButton().click();
        appleCinema30Page.chooseSelectOption(value).click();
    }

    private void inputTextarea(String text) {
        appleCinema30Page.getInputTextareaButton().click();
        appleCinema30Page.getInputTextareaButton().clear();
        appleCinema30Page.getInputTextareaButton().sendKeys(text);
    }

    private void inputDate(String date) {
        appleCinema30Page.getChooseDateButton().click();
        appleCinema30Page.getChooseDateButton().clear();
        appleCinema30Page.getChooseDateButton().sendKeys(date);
    }

    private void inputTime(String time) {
        appleCinema30Page.getChooseTimeButton().click();
        appleCinema30Page.getChooseTimeButton().clear();
        appleCinema30Page.getChooseTimeButton().sendKeys(time);
    }

    private void inputDateAndTime(String dateTime) {
        appleCinema30Page.getChooseDateAndTimeButton().click();
        appleCinema30Page.getChooseDateAndTimeButton().clear();
        appleCinema30Page.getChooseDateAndTimeButton().sendKeys(dateTime);
    }

    private void inputQuantity(String qty) {
        appleCinema30Page.getInputQuantityFieldButton().click();
        appleCinema30Page.getInputQuantityFieldButton().clear();
        appleCinema30Page.getInputQuantityFieldButton().sendKeys(qty);
    }

    private void uploadFileByButton(String path) {
        File file = new File(path);
        StringSelection absolutePath = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(absolutePath, null);
        appleCinema30Page.getUploadFileButton().click();
        // appleCinema30Page.getUploadFileButton().sendKeys(path);
        try {
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private void clickOnAddToCartButton() {
        appleCinema30Page.getAddToCartButton().click();
    }

    public void verifySuccessAddToCartAppleCinema(String productName) {
        Assert.assertTrue(appleCinema30Page.getAlert().getAttribute("class").contains("success"), "Product wasn't added to cart");
        Assert.assertTrue(appleCinema30Page.getAlert().getText().contains(productName), "Other item was added to cart");
    }
}

