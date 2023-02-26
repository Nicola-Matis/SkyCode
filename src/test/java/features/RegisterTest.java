package features;

import org.junit.Test;
import steps.RegisterSteps;
import utils.Constants;

public class RegisterTest extends BaseTest {

    @Test
    public void RegisterTest(){
        registerSteps.navigateToAccountPage();
        registerSteps.typeUserEmail(Constants.USER_EMAIL);
        registerSteps.typeUserPassword(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
        //NO ASSERTION NEEDED
    }

    @Test
    public void RegisterInvalidEmail(){
        registerSteps.navigateToAccountPage();
        registerSteps.typeUserEmail("invalidemail");
        registerSteps.typeUserPassword("kjgfkjlfghdjklkhjlgf");
        registerSteps.clickRegisterButton();
        registerSteps.isRegisterBoxVisibile();
    }

    @Test
    public void RegisterWithNoEmail(){
        registerSteps.navigateToAccountPage();
        registerSteps.typeUserPassword("kjgfkjlfghdjklkhjlgf");
        registerSteps.clickRegisterButton();
        registerSteps.isErrorMessageDisplayed();
    }
}
