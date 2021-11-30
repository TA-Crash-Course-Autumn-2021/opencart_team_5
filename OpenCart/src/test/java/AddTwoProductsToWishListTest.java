import com.opencart.navigation.Navigation;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.WishListPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddTwoProductsToWishListTest extends BaseTest {

    @Test
    public void loginAndAddMacBookAndIphoneToWishList() {
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
        mainPageBL.verifySuccessAddToWishListAlert(product2);
        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton();
        wishListPageBL.verifySuccessAddToWishList(product1);
        wishListPageBL.verifySuccessAddToWishList(product2);
    }
}
