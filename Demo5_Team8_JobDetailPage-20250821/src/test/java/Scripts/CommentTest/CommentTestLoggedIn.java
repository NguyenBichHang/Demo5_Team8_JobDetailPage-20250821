package Scripts.CommentTest;

import Pages.DetailJobPage;
import org.testng.annotations.Test;
import Scripts.BaseTest.LoggedInBaseTest;

public class CommentTestLoggedIn extends LoggedInBaseTest{
    @Test
    public void testDefaultValue() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.textareaDefaultValue();
    }

    @Test
    public void testCommentSuccess() throws InterruptedException {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputComment("hangtest");
    }

    @Test
    public void testCommentWithoutInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextareaRequired();
    }

    //    Test Seacrh Box
    @Test
    public void testTextboxSearchPlaceholder() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.verifyTextboxSearchPlaceholder();
    }

    @Test
    public void testSearchWithValidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("hangtest");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyValidSearchResult("hangtest");
    }

    @Test
    public void testSearchWithEmptyInput() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyAllCommentsAreDisplayed();
    }

    @Test
    public void testSearchWithInvalidKeyword() {
        DetailJobPage detailJobPage = new DetailJobPage(driver);
        detailJobPage.inputSearchText("NonExistent");
        detailJobPage.clickSearchButton();
        detailJobPage.waitForSearchResult();
        detailJobPage.verifyInvalidSearchResult("NonExistent");
    }

}
