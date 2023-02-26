package features;


import org.junit.Test;
import steps.CartSteps;

public class CartTest extends BaseTest {

    @Test
    public void AddItemToCart(){
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
    }

    @Test
    public void AddAndRemoveItemFromCart(){
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        cartSteps.navigateToCartPage();
        cartSteps.RemoveItemFromCart();
        cartSteps.isCartEmpty();
    }


    //BUTTON IS DISABLED
//    @Test
//    public void AddAndModifyProduct1FromCart(){
//        cartSteps.AddAndModifyProduct1FromCart();
//    }

    @Test
    public void AddItemToCartWhileLoggedIn(){
        loginSteps.doLogin2();
        AddItemToCart();
    }

    @Test
    public void AddAndRemoveProduct1FromCartWhileLoggedIn(){
        loginSteps.doLogin();
        AddAndRemoveItemFromCart();
    }

    @Test
    public void CartUATLoginLogout(){
        loginSteps.doLogin();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        loginSteps.doLogOut();
        loginSteps.doLogin();
        cartSteps.navigateToCartPage();
        cartSteps.isCartNotEmpty();
        cartSteps.RemoveItemFromCart();
    }
}
