import com.opencart.navigation.Navigation;
import com.opencart.steps.CanonEOS5DPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddTwoProductsToCartTest extends BaseTest{

    @Test
    public void addMacBookAndCanonEOSToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        //add MacBook
        String product1 = "MacBook";
        mainPageBL.addProductToCart(product1);
        mainPageBL.verifySuccessAddToCart(product1);
        // add Canon
        String product = "Canon EOS 5D";
        mainPageBL.addProductToCart(product);
        CanonEOS5DPageBL canonEOS5DPage = new CanonEOS5DPageBL();
        canonEOS5DPage.chooseOptionsCanonEOS5D().verifySuccessAddToCartAppleCinema(product);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = new ShoppingCartPageBL();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyMacBookInCard();
        shoppingCartPage.verifyCanonEos5DInCart();
    }
}
