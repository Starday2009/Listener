package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.RemoteDriverManager;

public class TaskPage {

    By createSub = By.xpath(".//*[@id='stqc_show']");
    By summary = By.xpath(".//*[@id='summary']");
    By assign = By.xpath(" .//*[@id='assign-to-me-trigger']");
    By submit = By.xpath(".//*[@id='create-issue-submit']");


   /* private final WebDriver driver;

    public TaskPage(WebDriver driver){
        this.driver = driver;
    }*/
   private WebDriver driver;

    public TaskPage() {
        this.driver = RemoteDriverManager.getDriver();

    }

    public TaskPage clickAddSub(){
        driver.findElement(createSub).click();
        return this;
    }
    public TaskPage typeSummary(String sum){
        driver.findElement(summary).sendKeys(sum);
        return this;
    }
    public TaskPage clickAssign(){
        driver.findElement(assign).click();
        return this;
    }
    public TaskPage clickSubmit(){
        driver.findElement(submit).click();
        return this;
    }
}
