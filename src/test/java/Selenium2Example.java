import org.testng.annotations.Test;
import ui.*;
import ui.BasePage;

import static org.testng.Assert.assertEquals;

public class Selenium2Example {
        LoginPage loginPage;
        Header header;
        TaskPage taskPage;

        @Test(groups = {"functest", "login"})
        public void login() throws InterruptedException {
            loginPage = new LoginPage();
            header = new Header();
            taskPage = new TaskPage();

            String issueId = "QAAUT-308";

            //login
            loginPage.open();
            assertEquals(loginPage.isOnThePage(), true);
            loginPage.typeUsername();
            loginPage.typePassword();
            loginPage.clickOnLogin();
            assertEquals(loginPage.isOnThePage(), true);

            //search task
            header.clickSearch();
            header.typeFind(issueId);

            /*add task
            taskPage.clickAddSubTask();
            Thread.sleep(3000);
            taskPage.typeSummaryOfSubTask("Oks sub task");
            taskPage.clickAssign();
            taskPage.clickSubmit();
            Thread.sleep(5000);*/

            //creating comment
            taskPage.clickOnCommentButton();
            assertEquals(taskPage.isOnThePage(issueId), true);
            taskPage.inputComment("This is my comment");
            assertEquals(taskPage.isOnThePage(issueId), true);
            taskPage.clickOnAddCommentButton();

            //deleting comment


        }

        // @AfterTest
        //  public void after(){ driver.quit();}




    }