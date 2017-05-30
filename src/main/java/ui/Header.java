package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.RemoteDriverManager;

public class Header extends BasePage{

    By createButton = By.xpath(".//*[@id='create_link']");
    By dashBoards = By.xpath(".//*[@id='home_link']");
    By projects = By.xpath(".//*[@id='browse_link']");
    By issues = By.xpath(".//*[@id='find_link']");
    By boards = By.xpath(".//*[@id='greenhopper_menu']");
    By testRail = By.xpath(".//*[@id='menu']");
    By burgerMenu =By.xpath(".//*[@id='header']/nav/div/div[1]/a");
    By search = By.xpath(".//*[@id='quickSearchInput']");
    By task = By.xpath( ".//*[@id='rapidb_lnk_13_lnk']");
    By drag = By.xpath( " .//*[@id='ghx-pool']/div[7]/ul/li[2]/div/div/div[4]/div[1]");
    By doneColumn = By.xpath( " .//*[@id='ghx-pool']/div[7]/ul/li[3]");

   /* private final WebDriver driver;

    public Header(WebDriver driver){
        this.driver = driver;
    }*/
   private WebDriver driver;

    public Header() {
        this.driver = RemoteDriverManager.getDriver();

    }
    public Header clickCreate(){
        waitToBePresentAndSendSubmit(createButton);
        return this;
    }

    public Header clickdashBoards(){
        waitToBePresentAndSendSubmit(dashBoards);
        return this;
    }
    public Header clickprojects(){
        waitToBePresentAndSendSubmit(projects);
        return this;
    }
    public Header clickissues(){
        waitToBePresentAndSendSubmit(issues);
        return this;
    }
    public Header clickboards(){
        waitToBePresentAndSendSubmit(boards);
        return this;
    }
    public Header clicktestRail(){
        waitToBePresentAndSendSubmit(testRail);
        return this;
    }
    public Header clickburgerMenu(){
        waitToBePresentAndSendSubmit(burgerMenu);
        return this;
    }
    public Header clickSearch(){
        waitToBePresentAndSendSubmit(search);
        return this;
    }
    public Header clickOnTask(){
        waitToBePresentAndSendSubmit(task);
        return this;
    }
    /*public Header moveIssueToDone() {
        WebElement draggable = driver.findElement(By.xpath( " .//*[@id='ghx-pool']/div[7]/ul/li[2]/div/div/div[4]/div[1]"));
        WebElement target = driver.findElement(By.xpath(".//*[@id='ghx-pool']/div[7]/ul/li[3]"));
        new Actions(driver).dragAndDrop(draggable, target).perform();
        return  this;
    }*/

    public Header typeFind(){
        waitToBePresentAndSendKeys(search, "QAAUT-308");
        /*
        WebElement element = driver.findElement(search);
        element.sendKeys(find);
        element.submit();
       driver.findElement(search).sendKeys(find);
       */
        return this;
    }



    }

