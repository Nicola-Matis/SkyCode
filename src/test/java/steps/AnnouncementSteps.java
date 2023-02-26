package steps;

import net.thucydides.core.annotations.Step;
import org.awaitility.Awaitility;
import org.junit.Assert;

public class AnnouncementSteps extends BaseSteps{

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void clickHelloWorld(){
        homePage.HelloWorldMessage();
    }

    @Step
    public void isReplyAvailable(){
        homePage.ReplyHelloWorldText();
    }

    @Step
    public void ReplyToHelloWorld(){
        homePage.ReplyToHelloWorld();
    }

    @Step
    public void wasCommentPosted(){
        homePage.AwaitingModeration();
    }
}
