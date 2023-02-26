package steps;

import net.thucydides.core.annotations.Step;
import static utils.Constants.USER_EMAIL;
import static utils.Constants.USER_PASS;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToAccountPage() {
        homePage.navigateToAccountPage();
    }

    @Step
    public void doLogin() {
        navigateToAccountPage();
        accountPage.setEmailField2(USER_EMAIL);
        accountPage.setPasswordField2(USER_PASS);
        accountPage.tickRememberMe();
        accountPage.clickLoginButton();
        accountPage.userIsLoggedIn("ignaa13vlad7");
    }

    @Step
    public void doLoginAndLogOut() {
        doLogin();
        accountPage.clickLogOutButton();
        accountPage.userisLoggedOut();
    }

    @Step
    public void doLogin2() {
        navigateToAccountPage();
        accountPage.setEmailField2("morosandenis4@gmail.com");
        accountPage.setPasswordField2("Den!s1_!();_#d@$");
        accountPage.tickRememberMe();
        accountPage.clickLoginButton();
        accountPage.userIsLoggedIn("morosandenis4");
    }

    @Step
    public void doLoginWrongPass() {
        navigateToAccountPage();
        accountPage.setEmailField2("morosandenis4@gmail.com");
        accountPage.setPasswordField2("Test");
        accountPage.tickRememberMe();
        accountPage.clickLoginButton();
        accountPage.isErrorMessageDisplayed();
    }

    @Step
    public void doLoginWrongEmail() {
        navigateToAccountPage();
        accountPage.setEmailField2("morosandenis4@gmail.co");
        accountPage.setPasswordField2("Test");
        accountPage.tickRememberMe();
        accountPage.clickLoginButton();
        accountPage.isErrorMessageDisplayed();
    }

    @Step
    public void doLogOut(){
        homePage.navigateToAccountPage();
        accountPage.clickLogOutButton();
    }
}
