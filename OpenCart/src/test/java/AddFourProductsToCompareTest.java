import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ProductComparisonPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.opencart.enums.URLs.BASE_URL;

public class AddFourProductsToCompareTest extends BaseTest{
    @Test
    public void checkAddFourProductsToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        String successIphoneAppears = new MainPageBL()
                .clickOnCompareToButton("iPhone")
                .verifySuccessProductComparison();
        Assert.assertTrue(successIphoneAppears.contains("Success: You have added iPhone to your product comparison!"));

        String successMacAppears = new MainPageBL()
                .clickOnCompareToButton("MacBook")
                .verifySuccessProductComparison();
        Assert.assertTrue(successMacAppears.contains("Success: You have added MacBook to your product comparison!"));

        String successCinemaAppears = new MainPageBL()
                .clickOnCompareToButton("Apple Cinema 30\"")
                .verifySuccessProductComparison();
        Assert.assertTrue(successCinemaAppears.contains("Success: You have added Apple Cinema 30\" to your product comparison!"));

        String successCanonAppears = new MainPageBL()
                .clickOnCompareToButton("Canon EOS 5D")
                .verifySuccessProductComparison();
        Assert.assertTrue(successCanonAppears.contains("Success: You have added Canon EOS 5D to your product comparison!"));

        String ifIphoneDisplayed = new MainPageBL()
                .clickOnComparisonAlertLink()
                .verifyIfIphoneIsInProductComparison();
        Assert.assertEquals(ifIphoneDisplayed, "iPhone");

        String ifMacbookDisplayed = new ProductComparisonPageBL()
                .verifyIfMacIsInProductComparison();
        Assert.assertEquals(ifMacbookDisplayed, "MacBook");

        String ifCinemaDisplayed = new ProductComparisonPageBL()
                .verifyIfCinemaIsInProductComparison();
        Assert.assertEquals(ifCinemaDisplayed, "Apple Cinema 30\"");

        String ifCanonDisplayed = new ProductComparisonPageBL()
                .verifyIfCanonIsInProductComparison();
        Assert.assertEquals(ifCanonDisplayed, "Canon EOS 5D");
    }
}
