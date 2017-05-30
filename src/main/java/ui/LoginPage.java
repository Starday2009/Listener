package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.RemoteDriverManager;

public class LoginPage extends BasePage{

    private String pageURL = baseURL + "/login.jsp";

    By loginField = By.xpath(".//*[@id='login-form-username']");
    By passwordField = By.xpath(".//*[@id='login-form-password']");
    By loginButton = By.xpath(".//*[@id='login-form-submit']");

   /* private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }*/

    private WebDriver driver;

    public LoginPage() {
        this.driver = RemoteDriverManager.getDriver();

    }

    public LoginPage open(){
        logger.info("OPENING URL: "+ pageURL);
        driver.get(pageURL);

        return this;
    }

    public LoginPage typeUsername(){
        waitToBePresentAndSendKeys(loginField, "oksana.gorbachenko.2009");
        return this;
    }

    public LoginPage typePassword(){
        waitToBePresentAndSendKeys(passwordField, "123456qwerty");
        return this;
    }

    public LoginPage clickOnLogin(){
        waitToBePresentAndSendSubmit(loginButton);
        return this;
    }

    public boolean isOnThePage(){
        return isOnThePage(pageURL);
    }

}
