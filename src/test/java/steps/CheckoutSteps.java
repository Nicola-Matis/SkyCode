package steps;

import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import pages.CheckOutPage;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void navigateToCheckoutPage(){
        homePage.navigateToCheckoutPage();
    }

    @Step
    public void typeFirstName(){
        checkOutPage.typeFirstName();
    }

    @Step
    public void typeLastName(){
        checkOutPage.typeLastName();
    }

    @Step
    public void typeOrderNotes(){checkOutPage.typeOrderNotes();}

    @Step
    public void typeCompanyName(){
        checkOutPage.typeCompanyName();
    }

    @Step
    public void typeAdress1(){
        checkOutPage.typeAdress1();
    }

    @Step
    public void typeCity(){
        checkOutPage.typeCity();
    }

    @Step
    public void typeCounty(){
        checkOutPage.typeCounty();
    }

    @Step
    public void typeBillingPostcode(){
        checkOutPage.typePostCode();
    }

    @Step
    public void typePhone(){
        checkOutPage.typePhone();
    }

    @Step
    public void clickPlaceOrder(){
        checkOutPage.clickPlaceOrder();
    }

    @Step
    public void clickCashOnDelivery(){
        checkOutPage.clickCashOnDelivery();
    }

    @Step
    public void isOrderReceivedDisplayed(){

    }
}
