import com.opencart.navigation.Navigation;
import com.opencart.steps.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ChangePersonalInfoTest extends BaseTest{

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
    public void changeFirstName() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnEditAccountButton();
        MyAccountInfoPageBL myAccountInfoPageBL = new MyAccountInfoPageBL();
        myAccountInfoPageBL.editFirstNameAboutPerson()
                            .clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

    @Test
    public void changeLastName() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnEditAccountButton();
        MyAccountInfoPageBL myAccountInfoPageBL = new MyAccountInfoPageBL();
        myAccountInfoPageBL.editLastNameAboutPerson()
                .clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

    @Test
    public void changeEmail() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnEditAccountButton();
        MyAccountInfoPageBL myAccountInfoPageBL = new MyAccountInfoPageBL();
        myAccountInfoPageBL.editEmailOfPerson()
                .clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

    @Test
    public void changeTelephone() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnEditAccountButton();
        MyAccountInfoPageBL myAccountInfoPageBL = new MyAccountInfoPageBL();
        myAccountInfoPageBL.editTelephoneOfPerson()
                .clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

    @Test
    public void changeAllAccountInfo() {
        EditAccountInfoPageBL editAccountInfoPageBL = new EditAccountInfoPageBL();
        editAccountInfoPageBL.clickOnEditAccountButton();
        MyAccountInfoPageBL myAccountInfoPageBL = new MyAccountInfoPageBL();
        myAccountInfoPageBL.editAllInfoAboutPerson().clickOnContinueButton();
        SuccessEditAccountPageBL successEditAccountPageBL = new SuccessEditAccountPageBL();
        successEditAccountPageBL.verifyEditingInfo();
    }

}
