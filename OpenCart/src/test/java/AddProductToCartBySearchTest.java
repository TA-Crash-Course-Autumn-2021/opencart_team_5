import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddProductToCartBySearchTest extends BaseTest{
    @Test
    public void addIphoneToCartBySearch(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "iPhone";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = new ShoppingCartPageBL();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyIPhoneInCart();
    }

    @Test
    public void addMacBookToCartBySearch(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "MacBook";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
        // check product in shoppingCart
        ShoppingCartPageBL shoppingCartPage = new ShoppingCartPageBL();
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyMacBookInCard();
    }

    @Test
    public void addAppleCinemaToCartBySearch(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "Apple Cinema 30\"";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .sendEnterToSearchProduct()
                .addProductToCart(product);
        AppleCinema30PageBL appleCinema30Page = new AppleCinema30PageBL();
        appleCinema30Page.chooseOptionsAppleCinema().verifySuccessAddToCartAppleCinema(product);
        ShoppingCartPageBL shoppingCartPage = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        // check product in shoppingCart
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyAppleCinemaInCart();
    }

    @Test
    public void addCanonEOSToCartBySearch(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "Canon EOS 5D";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .sendEnterToSearchProduct()
                .addProductToCart(product);
        CanonEOS5DPageBL canonEOS5DPage = new CanonEOS5DPageBL();
        canonEOS5DPage.chooseOptionsCanonEOS5D().verifySuccessAddToCartAppleCinema(product);
        ShoppingCartPageBL shoppingCartPage = mainPageBL.getHeaderPageBL()
                .clickOnShoppingCartButton();
        // check product in shoppingCart
        shoppingCartPage.clickOnShoppingCartButton();
        shoppingCartPage.verifyCanonEos5DInCart();
    }
}
