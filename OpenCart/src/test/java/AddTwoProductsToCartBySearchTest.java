import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddTwoProductsToCartBySearchTest extends BaseTest{
    @Test
    public void addMacBookAndIphoneToCartBySearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product1 = "MacBook";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product1)
                .clickOnSearchButton()
                .addProductToCart(product1);
        mainPageBL.verifySuccessAddToCart(product1);
        String product2 = "iPhone";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product2)
                .clickOnSearchButton()
                .addProductToCart(product2);
        mainPageBL.verifySuccessAddToCart(product2);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyProductInCart(product1);
        shoppingCartPage.verifyProductInCart(product2);
    }
}
