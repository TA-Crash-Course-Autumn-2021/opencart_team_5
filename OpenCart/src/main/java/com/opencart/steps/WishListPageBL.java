package com.opencart.steps;

import com.opencart.pages.WishListPage;
import org.testng.Assert;

public class WishListPageBL {

    private WishListPage wishListPage;

    public WishListPageBL() {
        wishListPage = new  WishListPage();
    }

    public void verifySuccessAddToWishList(String product) {
        Assert.assertTrue(wishListPage.getTitleOfProduct(product).getText().contains(product), "Product wasn't added to wish list");
    }

}
