package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    private WebElementFacade searchResultForProduct;

    public void isSearchResultVisible(){
        searchResultForProduct.isDisplayed();
    }
}

