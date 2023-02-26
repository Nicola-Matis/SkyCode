package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementResolverByElementLocator;

public class ShopPage extends BasePage{

    //ITEMS\\

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[1]/img")
    private WebElementFacade Item1;

    public void clickItem1(){clickOn(Item1);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[2]/a[1]/img")
    private WebElementFacade Item2;

    public void clickItem2(){clickOn(Item2);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[3]/a[1]/img")
    private WebElementFacade Item3;

    public void clickItem3(){clickOn(Item3);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[2]")
    private WebElementFacade Item1Cart;

    public void AddItem1ToCart(){clickOn(Item1Cart);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[2]/a[2]")
    private WebElementFacade Item2Cart;

    public void AddItem2ToCart(){clickOn(Item2Cart);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[3]/a[2]")
    private WebElementFacade Item3Cart;

    public void AddItem3ToCart(){clickOn(Item3Cart);}

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[3]")
    private WebElementFacade ViewCartFirstItem;

    public void clickViewCart1Item(){clickOn(ViewCartFirstItem);}

}
