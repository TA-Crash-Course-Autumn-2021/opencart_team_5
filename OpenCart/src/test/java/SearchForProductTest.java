import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class SearchForProductTest extends BaseTest{

    @Test
    public void searchIphone() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "iPhone";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .searchProductOnPage(product);
        mainPageBL.verifySuccessSearching(product);
    }

    @Test
    public void searchMacBook() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "MacBook";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .searchProductOnPage(product);
        mainPageBL.verifySuccessSearching(product);
    }

    @Test
    public void searchCanonEOS5D() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String product = "Canon EOS 5D";
        mainPageBL.getHeaderPageBL()
                .clickOnSearchField()
                .sendNameToSearchField(product)
                .clickOnSearchButton()
                .searchProductOnPage(product);
        mainPageBL.verifySuccessSearching(product);
    }

}
