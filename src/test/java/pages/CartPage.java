package pages;

import io.cucumber.java.ca.Quan;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.json.JsonOutput;

public class CartPage extends BasePage {

    //QUANTITY MODIFIER BUTTON IS DISABLED, THEREFORE TESTING IS NOT POSSIBLE
//    public void selectQuantity(String quantity){
//        typeInto(QuantityBox,quantity);
//    }

    @FindBy(xpath = "//*[@id=\"post-5\"]/div/div/form/table/tbody/tr[1]/td[1]/a")
    private WebElementFacade RemoveItem;

    public void RemoveItemFromCart() {
        clickOn(RemoveItem);
    }

    @FindBy(xpath = "//*[@id='quantity_63f0f9d363194']")
    private WebElementFacade QuantityBox;

    @FindBy(xpath = "//*[@id=\"post-5\"]/div/div[2]/p[1]")
    private WebElementFacade emptyCart;

    public void isCartEmpty() {
        emptyCart.isDisplayed();
    }

    public void isCartNotEmpty(){
        RemoveItem.isDisplayed();
    }
}
