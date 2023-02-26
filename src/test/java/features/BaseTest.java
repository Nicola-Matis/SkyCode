package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.*;
import utils.Constants;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected AnnouncementSteps announcementSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Before
    public void initTests() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }
}
