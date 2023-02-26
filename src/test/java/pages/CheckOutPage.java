package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class CheckOutPage extends BasePage{

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstName;

    public void typeFirstName(){
        typeInto(firstName, "Badea");
    }

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastName;

    public void typeLastName(){
        typeInto(lastName, "Mihai");
    }

    @FindBy(xpath = "//*[@id=\"order_comments\"]")
    private WebElementFacade orderNotes;

    public void typeOrderNotes(){
        typeInto(orderNotes, "-");
    }

    @FindBy(id = "billing_company")
    private WebElementFacade companyName;

    public void typeCompanyName(){
        typeInto(companyName, "-");
    }

    @FindBy(id = "billing_address_1")
    private WebElementFacade adress1;

    public void typeAdress1(){
        typeInto(adress1, "Strada 1 Mai nr 40");
    }

    @FindBy(id = "billing_city")
    private WebElementFacade billing_city;

    public void typeCity(){
        typeInto(billing_city, "Huedin");
    }

    @FindBy(xpath = "//*[@id=\"billing_state_field\"]/span/span[1]/span")
    private WebElementFacade countyDropDown;

    public void clickCountyDropDown(){
        countyDropDown.click();
    }

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElementFacade countyTextBox;

    @FindBy(xpath = "//*[@id=\"select2-billing_state-result-r86b-CJ\"]")
    private WebElementFacade clujCounty;

    public void typeCounty(){
        clickCountyDropDown();
        typeInto(countyTextBox, "Cluj");
    }

    @FindBy(id = "billing_postcode")
    private WebElementFacade billing_postcode;

    public void typePostCode(){
        typeInto(billing_postcode, "405400");
    }

    @FindBy(id = "billing_phone")
    private WebElementFacade billing_phone;

    public void typePhone(){
        typeInto(billing_phone, "0747784032");
    }

    @FindBy(id = "place_order")
    private WebElementFacade placeOrder;

    public void clickPlaceOrder(){
        clickOn(placeOrder);
    }

    @FindBy(xpath = "//*[@id=\"payment\"]/ul/li/label")
    private WebElementFacade cashOnDelivery;

    public void clickCashOnDelivery(){
        cashOnDelivery.click();
    }

    @FindBy(xpath = "//*[@id=\"post-6\"]/header/h1")
    private WebElementFacade orderReceived;

    public void isOrderReceivedDisplayed(){
        orderReceived.isDisplayed();
    }
}
