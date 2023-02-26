package features;


import org.junit.Test;

public class AnnouncementTest extends BaseTest {

    @Test
    public void clickHelloMessage(){
        announcementSteps.clickHelloWorld();
        announcementSteps.isReplyAvailable();
}

    @Test
    public void clickHelloMessageWhileLoggedIn(){
        loginSteps.doLogin();
        announcementSteps.navigateToHomePage();
        announcementSteps.clickHelloWorld();
        announcementSteps.isReplyAvailable();
    }


    @Test
    public void ReplyToHelloWorld(){
        loginSteps.doLogin();
        announcementSteps.navigateToHomePage();
        announcementSteps.clickHelloWorld();
        announcementSteps.ReplyToHelloWorld();
        announcementSteps.wasCommentPosted();
    }
}
