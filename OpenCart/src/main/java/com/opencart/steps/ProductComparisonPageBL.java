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

    public String verifyIfMacIsInProductComparison() {
        return productComparisonPage.getMacbookProductComparison().getText();
    }
}
