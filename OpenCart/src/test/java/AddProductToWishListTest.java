import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddProductToWishListTest extends BaseTest{

    @BeforeMethod
    public void loginPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        //clickOnOpencartImg - go to main Page
        loginPageBL.clickOnOpenCartImageButton();
    }

    @Test
    public void loginAndAddMacBookToWishList() {
        MainPageBL mainPageBL = new MainPageBL();
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

    @Test
    public void loginAndAddiPhoneToWishList() {
        MainPageBL mainPageBL = new MainPageBL();
        String product = "iPhone";
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
