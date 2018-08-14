package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginObjects {

    WebDriver driver;

     LoginObjects(WebDriver driver){

       this.driver = driver;
    }


    @CacheLookup
    @FindBy(how= How.CSS, using = "paper-icon-button[id='notification']")
    WebElement Select_Login;

    @CacheLookup
    @FindBy(how= How.CSS, using = "input[placeholder='Enter Username']")
    WebElement userName;

    @CacheLookup
    @FindBy(how= How.CSS, using = "input[placeholder='Enter Password']")
    WebElement passWord;

    @CacheLookup
    @FindBy(how= How.CSS, using = ".btn-info")
    WebElement click_Login;


    public void loginJUUL(String User_ID,String Pass_word) throws InterruptedException {
        //Thread.sleep(10000);
        Select_Login.click();
        userName.sendKeys(User_ID);
        passWord.sendKeys(Pass_word);
        click_Login.click();

    }

}
