import com.opencart.navigation.Navigation;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.WishListPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddFourProductsToWishListTest extends BaseTest{

    @Test
    public void loginAndAddMacBookAndIphoneAndAppleCinemaAndCanonToWishList() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.clickOnOpenCartImageButton();
        String product1 = "MacBook";
        mainPageBL.addProductToWishList(product1);
        mainPageBL.verifySuccessAddToWishListAlert(product1);
        String product2 = "iPhone";
        mainPageBL.addProductToWishList(product2);
        Thread.sleep(2000);
        mainPageBL.verifySuccessAddToWishListAlert(product2);
        String product3 = "Apple Cinema 30\"";
        mainPageBL.addProductToWishList(product3);
        Thread.sleep(2000);
        mainPageBL.verifySuccessAddToWishListAlert(product3);
        String product4 = "Canon EOS 5D";
        mainPageBL.addProductToWishList(product4);
        Thread.sleep(2000);
        mainPageBL.verifySuccessAddToWishListAlert(product4);
        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton();
        wishListPageBL.verifySuccessAddToWishList(product1);
        wishListPageBL.verifySuccessAddToWishList(product2);
        wishListPageBL.verifySuccessAddToWishList(product3);
        wishListPageBL.verifySuccessAddToWishList(product4);
    }
}
