package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(how= How.XPATH, using="//input[@id='input-email']")
    WebElement email;
    @FindBy(how= How.XPATH, using="//input[@id='input-password']")
    WebElement password;
    @FindBy(how= How.XPATH, using="//body/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton;

    @FindBy(how= How.XPATH, using="//div[@class='header-content']")
    WebElement userIcon;

    @FindBy(how= How.XPATH, using="//ul[@class='list-inline links']//a[contains(text(),'Logout')]")
     WebElement logout;


    public void loginPositive(String uid, String pass){
        email.sendKeys(uid);
        password.sendKeys(pass);
        loginButton.click();
    }
    public void logOut(){
        userIcon.click();
        logout.click();
        driver.quit();
    }






}



