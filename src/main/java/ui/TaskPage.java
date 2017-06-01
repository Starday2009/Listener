package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.RemoteDriverManager;

public class TaskPage extends BasePage{
    private String pageURL = baseURL + "/browse/%s";

    private TaskPage taskPage;

    private By createSub = By.xpath(".//*[@id='stqc_show']");
    private By summary = By.xpath(".//*[@id='summary']");
    private By assign = By.xpath(" .//*[@id='assign-to-me-trigger']");
    private By submit = By.xpath(".//*[@id='create-issue-submit']");
    private By addComment = By.xpath(".//*[@id='footer-comment-button']/span[2]");
    private By commentArea = By.id("comment");
    private By addCommentButton = By.id("issue-comment-add-submit");

    private String subTaskSummary = "//*[@class='stsummary']//*[contains(text(),'%s')]";
    private String subTaskNumber = "//*[@class='stsequence']//*[contains(text(),'%s')]";
    private String subTaskAssignee = "//*[@class='assignee']//*[contains(text(),'%s')]";
    private String commentText = "//*[@id='issue_actions_container']//child::*[contains(text(),'%s')]";

    /* private final WebDriver driver;

    public TaskPage(WebDriver driver){
        this.driver = driver;
    }*/
   private WebDriver driver;

    public TaskPage() {
        this.driver = RemoteDriverManager.getDriver();
        taskPage = new TaskPage();

    }

    public void openExistingIssue(String issueId){

        String url = String.format(pageURL, issueId);
        super.openExistingIssue(url);
    }
/*
    public TaskPage openNewSubTask() throws InterruptedException {

        waitToBePresentAndClick();
//todo need subtask locator
        return this;
    }*/

    public TaskPage clickAddSubTask(){
        waitToBePresentAndClick(createSub);
        return this;
    }
    public TaskPage typeSummaryOfSubTask(){
        waitToBePresentAndSendKeys(summary, "Oks`s sub task");
        return this;
    }
    public TaskPage clickAssign(){
        waitToBePresentAndClick(assign);
        return this;
    }
    public TaskPage clickSubmit(){
        waitToBePresentAndClick(submit);
        return this;
    }

    public TaskPage clickOnCommentButton(){
        waitToBePresentAndClick(addComment);
        return this;
    }

    public TaskPage clickOnAddCommentButton(){
        waitToBePresentAndClick(addCommentButton);
        return this;
    }
    public TaskPage inputComment(String text){
        waitToBePresentAndSendKeys(commentArea, "This is Oks comment");
        return this;
    }

    //checks

    public boolean isOnThePage(String issueId){

        String url = String.format(pageURL, issueId);
        return super.isOnThePage(url);
    }

    public boolean isSubTaskSummaryPresent(String title) {

        String selector = String.format(title, summary);
        return  waitToBePresentAndContainsText(By.xpath(selector), title);
    }


    public boolean isSubTaskSummaryMissing(String title) {

        String selector = String.format(title, summary);
        return waitToBeMissing(By.xpath(selector));

    }

   public boolean isSubTaskNumberPresent(String name) {

        String selector = String.format(subTaskNumber, name);
        return waitToBePresentAndContainsText(By.xpath(selector), name);

    }

    public boolean isSubTaskAssigneePresent(String name) {

        String selector = String.format(name, assign);
        return waitToBePresentAndContainsText(By.xpath(selector), name);

    }

    public boolean isCommentTextPresent(String text) {

        //TODO NEED COMMENT  TEXT

        String selector = String.format(text, commentArea);
        return waitToBePresentAndContainsText(By.xpath(selector), text);

    }

    public boolean isCommentTextMissing(String text) {

        //TODO NEED COMMENT  TEXT

        String selector = String.format(text, commentArea);
        return waitToBeMissing(By.xpath(selector));

    }

}
