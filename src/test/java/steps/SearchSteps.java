package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String value) {
        homePage.setSearchField(value + Keys.ENTER);
    }

    @Step
    public void isSearchResultVisible(){
        searchResultsPage.isSearchResultVisible();
    }
}
