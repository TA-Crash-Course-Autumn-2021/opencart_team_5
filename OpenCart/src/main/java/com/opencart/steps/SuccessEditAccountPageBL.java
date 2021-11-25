package com.opencart.steps;

import com.opencart.pages.SuccessEditAccountPage;
import org.testng.Assert;

public class SuccessEditAccountPageBL {

    private SuccessEditAccountPage successEditAccountPage;

    public SuccessEditAccountPageBL() {
        successEditAccountPage = new SuccessEditAccountPage();
    }

    public void verifyEditingInfo() {
        Assert.assertTrue(successEditAccountPage.getAlert().getAttribute("class").contains("success"), "Your account hasn't been successfully updated!");
    }
}
