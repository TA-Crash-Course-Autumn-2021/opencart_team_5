import com.opencart.navigation.Navigation;
import com.opencart.pages.ChangePasswordPage;
import com.opencart.pages.EditAccountInfoPage;
import com.opencart.steps.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ChangePasswordTest extends BaseTest{

    @BeforeMethod
    public void registerNewPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
    }

    @Test
    public void registerUserAndChangePasswordPositive() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnPasswordButton();
        ChangePasswordPageBL changePasswordPageBL = new ChangePasswordPageBL();
        String password = RandomStringUtils.randomAlphabetic(7);
        changePasswordPageBL.inputCurrentPassword(password)
                            .inputNewPassword(password)
                            .clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

    @Test
    public void registerUserAndChangePasswordNegative() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnPasswordButton();
        ChangePasswordPageBL changePasswordPageBL = new ChangePasswordPageBL();
        String password1 = RandomStringUtils.randomAlphabetic(7);
        String password2 = RandomStringUtils.randomAlphabetic(5);
        changePasswordPageBL.inputCurrentPassword(password1)
                .inputNewPassword(password2)
                .clickOnContinueButton()
                .verifyNotMatchingPassword();
    }
}
