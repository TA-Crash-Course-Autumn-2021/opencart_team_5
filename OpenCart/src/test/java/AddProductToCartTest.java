import com.opencart.navigation.Navigation;
import com.opencart.steps.AppleCinema30PageBL;
import com.opencart.steps.CanonEOS5DPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddProductToCartTest extends BaseTest{

    @Test
    public void addMacBookToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "MacBook";
        mainPageBL.addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
    }

    @Test
    public void addIPhoneToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "iPhone";
        mainPageBL.addProductToCart(product);
        mainPageBL.verifySuccessAddToCart(product);
    }

    @Test
    public void addAppleCinemaToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "Apple Cinema 30\"";
        mainPageBL.addProductToCart(product);
        AppleCinema30PageBL appleCinema30Page = new AppleCinema30PageBL();
        appleCinema30Page.chooseOptionsAppleCinema().verifySuccessAddToCartAppleCinema(product);
    }

    @Test
    public void addCanonEOSToCart() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "Canon EOS 5D";
        mainPageBL.addProductToCart(product);
        CanonEOS5DPageBL canonEOS5DPage = new CanonEOS5DPageBL();
        canonEOS5DPage.chooseOptionsCanonEOS5D().verifySuccessAddToCartAppleCinema(product);
    }
}
