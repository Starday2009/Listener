import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import ui.*;
public class Selenium2Example {

        LoginPage loginPage;
        Header header;
        TaskPage taskPage;
/*
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"functest"})
    public void testMethod1(String myParam) {
        // System.out.println("I got a parameter: " + myParam);
        Assert.assertTrue(true);
    }
*/
        @Test(groups = {"functest", "login"})
        public void login() throws InterruptedException {
            loginPage.open();
            loginPage.typeUsername("oksana.gorbachenko.2009");
            loginPage.typePassword("123456qwerty");
            loginPage.clickOnLogin();
            Thread.sleep(4000);
            //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            header.clickSearch();
            header.typeFind("QAAUT-60");
            Thread.sleep(4000);
            taskPage.clickAddSub();
            Thread.sleep(3000);
            taskPage.typeSummary("Oks sub task");
            taskPage.clickAssign();
            taskPage.clickSubmit();
            Thread.sleep(5000);

        }

 /*   @Test(groups ={"functest", "drag"})
    public void drag() throws InterruptedException{
            loginPage.open();
        loginPage.typeUsername("oksana.gorbachenko.2009");
        loginPage.typePassword("123456qwerty");
        loginPage.clickOnLogin();
        Thread.sleep(4000);
        header.clickboards();
        Thread.sleep(400);
        header.clickOnTask();
        Thread.sleep(400);*/

      // JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("window.scrollBy(500,0)", "");
       // Thread.sleep(5000);
     //   header.moveIssueToDone();
      //  Thread.sleep(5000);


        // @AfterTest
        //  public void after(){ driver.quit();}




    }