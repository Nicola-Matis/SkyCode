package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.ShopPage;

public class CartSteps extends BaseSteps{

    //QUANTITY MODIFIER BUTTON IS DISABLED, THEREFORE TESTING IS NOT POSSIBLE
//    @Step
//    public void AddAndModifyProduct1FromCart(){
//        homePage.open();
//        homePage.clickShopButton();
//        shopPage.AddItem1ToCart();
//        shopPage.clickViewCart1Item();
//        cartPage.selectQuantity("2");
//    }

    @Step
    public void navigateToCartPage(){
        homePage.navigateToCartPage();
    }

    @Step
    public void navigateToShopPage(){
        homePage.navigateToShopPage();
    }

    @Step
    public void AddItem1ToCart(){
        shopPage.AddItem1ToCart();
}

    @Step
    public void AddItem2ToCart(){shopPage.AddItem2ToCart();}

    @Step
    public void AddItem3ToCart(){shopPage.AddItem3ToCart();}

    @Step
    public void Wait2Seconds(){
        waitABit(2000);
}

    @Step
    public void RemoveItemFromCart(){
        cartPage.RemoveItemFromCart();
    }

    @Step
    public void isCartEmpty() {
        cartPage.isCartEmpty();
    }

    @Step
    public void isCartNotEmpty(){cartPage.isCartNotEmpty();}
}
