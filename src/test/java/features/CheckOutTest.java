package features;

import org.junit.Test;

public class CheckOutTest extends BaseTest{

    @Test
    public void doCheckoutForItem1(){
        loginSteps.doLogin();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.typeFirstName();
        checkoutSteps.typeLastName();
        checkoutSteps.typeOrderNotes();
        checkoutSteps.typeCompanyName();
        checkoutSteps.typeAdress1();
        checkoutSteps.typeCity();
        checkoutSteps.typeCounty();
        checkoutSteps.clickCashOnDelivery();
        checkoutSteps.typeBillingPostcode();
        checkoutSteps.typePhone();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.isOrderReceivedDisplayed();
    }

    @Test
    public void doCheckoutForItem1MultipleTimes(){
        loginSteps.doLogin();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.typeFirstName();
        checkoutSteps.typeLastName();
        checkoutSteps.typeOrderNotes();
        checkoutSteps.typeCompanyName();
        checkoutSteps.typeAdress1();
        checkoutSteps.typeCity();
        checkoutSteps.typeCounty();
        checkoutSteps.clickCashOnDelivery();
        checkoutSteps.typeBillingPostcode();
        checkoutSteps.typePhone();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.isOrderReceivedDisplayed();
    }

    @Test
    public void doCheckoutForMultipleItems(){
        loginSteps.doLogin();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem1ToCart();
        cartSteps.Wait2Seconds();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem2ToCart();
        cartSteps.Wait2Seconds();
        cartSteps.navigateToShopPage();
        cartSteps.AddItem3ToCart();
        cartSteps.Wait2Seconds();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.typeFirstName();
        checkoutSteps.typeLastName();
        checkoutSteps.typeOrderNotes();
        checkoutSteps.typeCompanyName();
        checkoutSteps.typeAdress1();
        checkoutSteps.typeCity();
        checkoutSteps.typeCounty();
        checkoutSteps.clickCashOnDelivery();
        checkoutSteps.typeBillingPostcode();
        checkoutSteps.typePhone();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.isOrderReceivedDisplayed();
    }
}
