import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddProductToWishListTest extends BaseTest{

    @Test
    public void loginAndAddMacBookToWishList() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        //clickOnOpencartImg - go to main Page
        loginPageBL.clickOnOpenCartImageButton();
        String product = "MacBook";
        //clickOnAddToWishList
        mainPageBL.addProductToWishList(product);
        // check product in wishList alert
        mainPageBL.verifySuccessAddToWishListAlert(product);
        // check product in wishList
        WishListPageBL wishListPageBL = mainPageBL.getHeaderPageBL()
                .clickOnWishListButton();
        //WishListPageBL wishListPageBL = new WishListPageBL();
        wishListPageBL.verifySuccessAddToWishList(product);
    }
}
