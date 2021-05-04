package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testPages.BrowserFactory;
import testPages.LoginPage;

public class LoginPositive {
    WebDriver driver = BrowserFactory.startBrowser("chrome");
    @Test(priority = 1)
    public void checkValidUserLogin(){
        driver.get("https://www.true-elements.com/index.php?route=account/login");
        LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
        login_page.loginPositive("testpom@mailinator.com", "Qqqqq@12345");


    }
    @Test(priority = 2)
    public void userLogout(){
        LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
        login_page.logOut();
    }

}
