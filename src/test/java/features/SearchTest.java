package features;

import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchForProductKeywordTest(){
        searchSteps.searchForKeyword("0");
        searchSteps.isSearchResultVisible();
    }

}
