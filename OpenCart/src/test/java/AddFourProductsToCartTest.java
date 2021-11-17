import com.opencart.navigation.Navigation;
import com.opencart.steps.AppleCinema30PageBL;
import com.opencart.steps.CanonEOS5DPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddFourProductsToCartTest extends BaseTest{

    @Test
    public void addMacBookAndCanonEOSAndAppleCinemaToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        //add MacBook
        String product1 = "MacBook";
        mainPageBL.addProductToCart(product1);
        mainPageBL.verifySuccessAddToCart(product1);
        // add Apple Cinema
        String product3 = "Apple Cinema 30\"";
        mainPageBL.addProductToCart(product3);
        AppleCinema30PageBL appleCinema30Page = new AppleCinema30PageBL();
        appleCinema30Page.chooseOptionsAppleCinema();
        appleCinema30Page.verifySuccessAddToCartAppleCinema(product3);
        appleCinema30Page.clickOnOpenCartImageButton();
        //add iPhone
        String product = "iPhone";
        mainPageBL.addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
        // add Canon
        String product2 = "Canon EOS 5D";
        mainPageBL.addProductToCart(product2);
        CanonEOS5DPageBL canonEOS5DPage = new CanonEOS5DPageBL();
        canonEOS5DPage.chooseOptionsCanonEOS5D();
        canonEOS5DPage.verifySuccessAddToCartAppleCinema(product2);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = new ShoppingCartPageBL();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyMacBookInCard();
        shoppingCartPage.verifyCanonEos5DInCart();
        shoppingCartPage.verifyIPhoneInCart();
        shoppingCartPage.verifyAppleCinemaInCart();
    }
}
