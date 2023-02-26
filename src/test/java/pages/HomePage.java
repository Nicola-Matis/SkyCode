package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static utils.Constants.*;

@DefaultUrl(BASE_URL)
public class HomePage extends BasePage{

    //HOMEPAGE CATEGORIES\\

    @FindBy(xpath = "//*[@id=\"menu-item-58\"]/a")
    private WebElementFacade accountButton;

    public void navigateToAccountPage() {
        clickOn(accountButton);
    }

    @FindBy(xpath = "//*[@id=\"menu-item-59\"]")
    private WebElementFacade cartButton;

    public void navigateToCartPage(){clickOn(cartButton);}

    @FindBy(xpath = "//*[@id=\"menu-item-60\"]/a")
    private WebElementFacade shopButton;

    public void navigateToShopPage(){clickOn(shopButton);}

    @FindBy(xpath = "//*[@id=\"menu-item-61\"]/a")
    private WebElementFacade checkoutButton;

    public void navigateToCheckoutPage(){clickOn(checkoutButton);}

    @FindBy(xpath = "//*[@id=\"primary-menu\"]/li[6]/a")
    private WebElementFacade shoppingCartButton;

    public void clickOnShoppingCartButton(){
        clickOn(shoppingCartButton);
    }

    //ADMIN MESSAGES\\

    @FindBy(xpath = "//*[@id=\"post-1\"]/div/header/h1/a")
    private WebElementFacade HelloWorld;

    public void HelloWorldMessage(){
        clickOn(HelloWorld);
    }

    @FindBy(xpath = "//*[@id=\"reply-title\"]")
    private WebElementFacade ReplyToHelloWorld;

    public void ReplyHelloWorldText(){
        ReplyToHelloWorld.isDisplayed();
    }

    @FindBy(name = "comment")
    private WebElementFacade ReplyBox;

    public void ReplyToHelloWorld(){
        typeInto(ReplyBox, "Test");
    }

    @FindBy(xpath = "//*[@id=\"div-comment-605\"]/footer/p")
    private WebElementFacade Moderation;

    public void AwaitingModeration(){
        Moderation.isDisplayed();
    }

    //SEARCH\\

    @FindBy(xpath = "//*[@id=\"search-2\"]/form/label/input")
    private WebElementFacade searchField;

    public void setSearchField(String value){
        typeInto(searchField, value);
    }
}
