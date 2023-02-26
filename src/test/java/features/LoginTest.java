package features;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void doLogin(){
        loginSteps.doLogin();
    }

    @Test
    public void doLoginAndOut(){
        loginSteps.doLoginAndLogOut();
    }

    @Test
    public void doLoginWrongPass(){
        loginSteps.doLoginWrongPass();
    }

    @Test
    public void doLoginWrongEmail(){
        loginSteps.doLoginWrongEmail();
    }
}
