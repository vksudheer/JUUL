package JuulScripts;

import PageObjects.LoginObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;
    @Test
    public void login_JUUL() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\JUUL\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.10.6.131:8095/#/systemui/home");
        LoginObjects login =  PageFactory.initElements(driver,LoginObjects.class);
        //Thread.sleep(7000);
        login.loginJUUL("Devp","Devp");
        }
      }
