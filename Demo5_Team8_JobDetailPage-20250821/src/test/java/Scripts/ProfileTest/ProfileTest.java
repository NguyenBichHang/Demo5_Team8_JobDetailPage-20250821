package Scripts.ProfileTest;

import Pages.DetailJobPage;
import Pages.ProfilePage;
import Scripts.BaseTest.LoggedInBaseTest;
import org.testng.annotations.Test;

public class ProfileTest extends LoggedInBaseTest {
    @Test
    public void testJobDisplay() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyJobDisplay();
    }

    @Test
    public void testJobDisplayEmpty() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyJobDisplayEmpty();
    }

    @Test
    public void testJobDetailContent() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyJobDetailContent();
    }

    @Test
    public void testViewDetailButton() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        detailJobPage.clickTabBasic();
        detailJobPage.verifyContinueButtonLoggedIn();
        profilePage.verifyViewDetailButton();
    }

    @Test
    public void testDelButton() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDelButton();
        profilePage.verifyDelButtonDisplay();
    }

    @Test
    public void testAlertCloseButton() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDelButton();
        profilePage.verifyAlertCloseButton();
    }

    @Test
    public void testAlertDisplayWhenClicking() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDelButton();
        profilePage.verifyAlertDisplayWhenClicking();
    }
    @Test
    public void testHoverAlert() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDelButton();
        profilePage.verifyHoverAlert();
    }

    @Test
    public void testMoveOutAlert() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickDelButton();
        profilePage.verifyHoverAlert();
    }
}
