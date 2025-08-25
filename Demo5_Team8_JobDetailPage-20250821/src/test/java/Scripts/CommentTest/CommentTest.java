package Scripts.CommentTest;

import Listener.SimpleListener;
import Pages.DetailJobPage;
import Scripts.BaseTest.NotLoggedInBaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SimpleListener.class)
public class CommentTest extends NotLoggedInBaseTest {
    //    Test Job Detail Display
    public void testJobDetailDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageDisplayed();
    }

    //    Test Image
    @Test
    public void testImageDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageDisplayed();
    }

    @Test
    public void testImageHoverTransition() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyImageHoverTransition();
    }

    //    Test Package
    @Test
    public void testContinueButtonTabBasicNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testContinueButtonTabStandardNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testContinueButtonTabPremiumNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyContinueButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabBasicNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabStandardNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    @Test
    public void testCompareButtonTabPremiumNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyCompareButtonNotLoggedIn();
    }

    @Test
    public void testContinueButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testContinueButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testContinueButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
    }

    @Test
    public void testAlertCloseButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertCloseButton();
    }

    @Test
    public void testContinueAlertDisplayWhenClicking() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueAlertDisplayWhenClicking();
    }

    @Test
    public void testHoverContinueAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyHoverContinueAlert();
    }

    @Test
    public void testMoveOutAlert() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyMoveOutAlert();
    }

    @Test
    public void testCompareButtonTabBasic() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test
    public void testCompareButtonTabStandard() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabStandard();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    @Test
    public void testCompareButtonTabPremium() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.clickTabPremium();
        detailJobPage.verifyCompareButtonLoggedIn();
    }

    //    Test About The Seller
    @Test
    public void testSellerAvatarDisplayedOrAlt() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAvatarDisplay();
    }

    @Test
    public void testContactMeButtonNotLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyContactMeButtonNotLoggedIn();
    }

    @Test
    public void testContactModalDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyContactModalDisplay();
    }

    //    Test FAQ Section
    @Test
    public void testFAQSectionDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyFAQSectionDisplay();
    }

    @Test
    public void testFAQDefaultDisplay() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyQuestionDefaultDisplay();
    }

    @Test
    public void testAnswerDisplayWhenCLickQuestion() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerDisplayWhenCLicking();
    }

    @Test
    public void testAnswerHiddenWhenClosing() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyAnswerHiddenWhenClosing();
    }

    //    Test Comment Section
    @Test
    public void testDefaultValue() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.isTextareaEmpty();
    }

    @Test
    public void testCommentWithoutLoggedIn() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.clickCommentButton();
        detailJobPage.verifyCommentFailBecauseNotLoggedIn();
    }

    @Test
    public void testCommentWithoutInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextareaRequired();
    }

    @Test
    public void testCommentWithRatingStar() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("test");
        detailJobPage.selectRating(4);
        detailJobPage.verifyHoverStartsHightlight();
        detailJobPage.clickCommentButton();
        detailJobPage.verifySelectedStar(4);
        detailJobPage.verifyLatestCommentText("test");
    }
}
