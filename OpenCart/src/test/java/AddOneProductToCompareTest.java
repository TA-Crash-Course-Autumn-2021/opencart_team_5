import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.ProductComparisonPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddOneProductToCompareTest extends BaseTest{
    @Test
    public void checkAddOneProductToCompare() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        String successMessageAppears = new MainPageBL()
                  .clickOnCompareToButton()
                  .verifySuccessProductComparison();
        Assert.assertTrue(successMessageAppears.contains("Success: You have added MacBook to your product comparison!"));

        String ifMacbookDisplayed = new MainPageBL()
                .clickOnComparisonAlertLink()
                .verifyIfMacIsInProductComparison();
        Assert.assertEquals(ifMacbookDisplayed, "MacBook");
        Thread.sleep(2000);
    }
}
