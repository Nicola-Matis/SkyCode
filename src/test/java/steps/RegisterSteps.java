package steps;

import net.thucydides.core.annotations.Step;

import static utils.Constants.*;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToAccountPage(){
        homePage.navigateToAccountPage();
    }

    @Step
    public void typeUserEmail(String email){
        accountPage.setEmailField1(email);
    }

    @Step
    public void typeUserPassword(String password){
        accountPage.setPasswordField1(password);
    }

    @Step
    public void clickRegisterButton() {
        accountPage.clickRegisterButton();
    }

    @Step
    public void isRegisterBoxVisibile(){
        accountPage.isRegisterBoxDisplayed();
    }

    @Step
    public void isErrorMessageDisplayed(){
        accountPage.isErrorMessageDisplayed();
    }
}