import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ProductComparisonPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static com.opencart.enums.URLs.BASE_URL;

public class AddTwoProductsToCompareTest extends BaseTest{

    @Test
    public void checkAddTwoProductsToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        String successIphoneAppears = new MainPageBL()
                .clickOnCompareToButton("iPhone")
                .verifySuccessProductComparison();
        Assert.assertTrue(successIphoneAppears.contains("Success: You have added iPhone to your product comparison!"));

        String successMacAppears = new MainPageBL()
                .clickOnCompareToButton("MacBook")
                .verifySuccessProductComparison();
        Assert.assertTrue(successMacAppears.contains("Success: You have added MacBook to your product comparison!"));

        String ifIphoneDisplayed = new MainPageBL()
                .clickOnComparisonAlertLink()
                .verifyIfIphoneIsInProductComparison();
        Assert.assertEquals(ifIphoneDisplayed, "iPhone");

        String ifMacbookDisplayed = new ProductComparisonPageBL()
                .verifyIfMacIsInProductComparison();
        Assert.assertEquals(ifMacbookDisplayed, "MacBook");
    }
}
