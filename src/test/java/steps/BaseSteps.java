package steps;

import net.thucydides.core.steps.ScenarioSteps;
import pages.*;
import steps.LoginSteps;

public class BaseSteps extends ScenarioSteps {

    protected HomePage homePage;
    protected AccountPage accountPage;

    protected CartPage cartPage;

    protected ShopPage shopPage;

    protected LoginSteps loginSteps;

    protected SearchResultsPage searchResultsPage;

    protected BasePage basePage;

    protected CheckOutPage checkOutPage;
}
