package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class AccountPage extends BasePage{

    //REGISTER\\

    @FindBy(id = "reg_email")
    private WebElementFacade emailField1;

    public void setEmailField1(String email) {
        typeInto(emailField1, email);
    }

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField1;

    public void setPasswordField1(String password){
        typeInto(passwordField1, password);
    }

    @FindBy(name = "register")
    private WebElementFacade registerButton;

    public void clickRegisterButton(){
        registerButton.click();
    }

    //LOGIN\\

    @FindBy(id = "username")
    private WebElementFacade emailField2;

    public void setEmailField2(String email){
        typeInto(emailField2, email);
    }

    @FindBy(id = "password")
    private WebElementFacade passwordField2;

    public void setPasswordField2(String password){
        typeInto(passwordField2, password);
    }

    @FindBy(id = "rememberme")
    private WebElementFacade rememberme;

    //BUTTONS\\

    @FindBy(xpath = "//*[@id=\"menu-item-58\"]/a")
    private WebElementFacade accountButton;

    public void clickAccountButton() {
        clickOn(accountButton);
    }

    public void tickRememberMe(){
        rememberme.click();
    }

    @FindBy(name = "login")
    private WebElementFacade loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]/a")
    private WebElementFacade logOutButton;

    //CONFIRMATION MESSAGES\\

    public void clickLogOutButton(){
        logOutButton.click();
    }

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]/strong[1]")
    private WebElementFacade loginMessage;

   public void userIsLoggedIn(String userName){
       loginMessage.shouldContainOnlyText(userName);
   }

   @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[4]/a")
    private WebElementFacade logoutMessage;

   public void userisLoggedOut(){
       logoutMessage.isDisplayed();
   }

   @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/ul/li/strong[1]")
    private WebElementFacade errorMessage;

   public void isErrorMessageDisplayed(){
       errorMessage.isDisplayed();
   }

   public void isRegisterBoxDisplayed(){emailField1.isDisplayed();}

}
