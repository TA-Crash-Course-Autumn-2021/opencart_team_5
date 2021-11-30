package com.opencart.steps;

import com.opencart.pages.MainPage;
import com.opencart.pages.ProductComparisonPage;

public class ProductComparisonPageBL {
    private ProductComparisonPage productComparisonPage;

    public ProductComparisonPageBL() {
        productComparisonPage = new ProductComparisonPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    //mine
    public String verifyIfMacIsInProductComparison() {
        return productComparisonPage.getMacbookProductComparison().getText();
    }

    //mine
    public String verifyIfIphoneIsInProductComparison() {
        return productComparisonPage.getIphoneProductComparison().getText();
    }

    //mine
    public String verifyIfCinemaIsInProductComparison() {
        return productComparisonPage.getCinemaProductComparison().getText();
    }

    public String verifyIfCanonIsInProductComparison() {
        return productComparisonPage.getCanonProductComparison().getText();
    }
}
