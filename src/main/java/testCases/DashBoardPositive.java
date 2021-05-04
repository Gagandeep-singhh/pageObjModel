package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testPages.AddNewAddress;
import testPages.BrowserFactory;
import testPages.DashBoardPage;
import testPages.LoginPage;

public class DashBoardPositive {

    WebDriver driver = BrowserFactory.startBrowser("chrome");
    @Test(priority = 1)
    public void Login(){
        driver.get("https://www.true-elements.com/index.php?route=account/login");
        LoginPage login_page= PageFactory.initElements(driver, LoginPage.class);
        login_page.loginPositive("testpom@mailinator.com", "Qqqqq@12345");


    }
    @Test(priority = 2)
    public void goToDashboard(){
        DashBoardPage dashboard=PageFactory.initElements(driver, DashBoardPage.class);
        dashboard.goToDashboard();

    }
    @Test(priority = 3)
    public void addAddress(){
        DashBoardPage dashboard=PageFactory.initElements(driver, DashBoardPage.class);
        AddNewAddress addHomeAddr=PageFactory.initElements(driver,AddNewAddress.class);
        dashboard.goToDashboard();
        addHomeAddr.saveAddress();

    }
}
