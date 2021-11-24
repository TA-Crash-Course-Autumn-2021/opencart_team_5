import com.opencart.navigation.Navigation;
import com.opencart.steps.AppleCinema30PageBL;
import com.opencart.steps.CanonEOS5DPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ShoppingCartPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddFourProductsToCartBySearchTest extends BaseTest{

    @Test
    public void addMacBookAndCanonEOSAndAppleCinemaToCart(){
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
        String product3 = "Apple Cinema 30\"";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product3)
                .sendEnterToSearchProduct()
                .addProductToCart(product3);
        AppleCinema30PageBL appleCinema30Page = new AppleCinema30PageBL();
        appleCinema30Page.chooseOptionsAppleCinema().verifySuccessAddToCartAppleCinema(product3);
        String product4 = "Canon EOS 5D";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product4)
                .sendEnterToSearchProduct()
                .addProductToCart(product4);
        CanonEOS5DPageBL canonEOS5DPage = new CanonEOS5DPageBL();
        canonEOS5DPage.chooseOptionsCanonEOS5D().verifySuccessAddToCartAppleCinema(product4);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyMacBookInCard();
        shoppingCartPage.verifyIPhoneInCart();
        shoppingCartPage.verifyAppleCinemaInCart();
        shoppingCartPage.verifyCanonEos5DInCart();
    }

}
